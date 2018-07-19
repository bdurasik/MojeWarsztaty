import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodersGuruLogin {

    private WebDriver driver;

    private final String loginPageUrl = "https://wro-tem-s-01.codersguru.pl/login";

    @Given("browser with (.*) open")
    public void browserWithPageOpen(String pageToOpen) {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        //jeżeli zmienna page to open zawiera tekst wikipedia login page
        if (pageToOpen.equals("Wikipedia Login Page"))
            //to nawiguj do strony logowania
            driver.get(loginPageUrl);
        else System.out.println("Wrong keyword: " + pageToOpen);

    }

    @And("user input (.*) into (.*) field")
    public void userInputLoginIntoLoginField(String value, String fieldType) {
        WebElement inputLogin = driver.findElement(By.id("wpName1"));
        WebElement inputPassword = driver.findElement(By.id("wpPassword1"));
        switch (fieldType) {
            case "Login":
                inputLogin.sendKeys(value);
                break;
            case "Password":
                inputPassword.sendKeys(value);
                break;
            default:
                System.out.println("Wrong field type: " + fieldType);

        }


    }
}