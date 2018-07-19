import junit.extensions.TestSetup;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginPageTest {
    private WebDriver driver;

//region setup
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 0.otworzyć przeglądarke
        // 1.wejście na stronę https://wro-tem-s-01.codersguru.pl/
        driver.get("https://wro-tem-s-01.codersguru.pl/login");


    }
    @After
    public void tearDown() {

        driver.quit();
        driver = null;
    }
    //end region




    @Test
    public void canNotLoginGivenNoData(){


                // 2.klikniecie przycisku Zaloguj

                // 3.podwojne klikniecie przycisku zaloguj 2
        driver.findElement(By.id("_submit")).click();
        driver.findElement(By.id("_submit")).click();

        Assert.assertTrue(
                "Warning is not displayed!",
                driver.findElement(By.cssSelector("form > span")).isDisplayed()
        );

        Assert.assertEquals(
                 "Warning message did not match!",
                 "To pole jest wymagane",
        driver.findElement(By.cssSelector("form > span")).getText()
        );



    }

    @Test
    public void canNotLoginGivenNoDataa() {

        driver.findElement(By.id("username")).sendKeys("zly@mail.com");
        driver.findElement(By.id("password")).sendKeys("zlehaslo");
        driver.findElement(By.linkText("_submit")).click();

        Assert.assertTrue("Warning is displayed",
                driver.findElement(By.className("db-info")).isDisplayed()
        );

        Assert.assertEquals("Warning message did not match!", "nieprawidłowe dane",
                driver.findElement(By.className("db-info")).getText()


        );
    }
    @Test
    public void canNotLoginGivenValidData() {


       // driver.findElement(By.id("username")).sendKeys("coders.guru@example.com");
        // driver.findElement(By.id("password")).sendKeys("password");
       // driver.findElement(By.linkText("Zaloguj")).click();

        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.loginAs("coders.guru@example.com", "password");



        Assert.assertEquals(
                "Wrong Url",
                "https://wro-tem-s-01.codersguru.pl/",
                driver.getCurrentUrl()
        );
        Assert.assertEquals(
                "Wrong user logged in!",
                "Adam",
                driver.findElement(By.id("user-name")).getText()
        );


        driver.quit();


    }

}


