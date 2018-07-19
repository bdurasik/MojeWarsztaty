import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPageTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://wro-tem-s-01.codersguru.pl/register/");
    }

    @After
    public void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    public void canOpenRegisterPage() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.open();
        Assert.assertTrue(registerPage.isAt());
    }

    @Test
    public void canRegisterNewIndividualUser(){
        RegisterPage registerPage = new RegisterPage(driver);
        ConfirmedPage confirmedPage = new ConfirmedPage(driver);
        registerPage.open();
        registerPage.registerNewIndividualUser();
        Assert.assertTrue(confirmedPage.isAt());
        Assert.assertEquals("Adam", confirmedPage.getLoggedUserName());
    }
}