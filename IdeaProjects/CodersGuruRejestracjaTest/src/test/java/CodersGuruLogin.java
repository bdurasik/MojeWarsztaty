mport cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodersGuruLogin{

    private WebDriver driver;

    private final String loginPageUrl = "https://wro-tem-s-01.codersguru.pl/login";


    @Given("browser with (.*) open")
    public void browserWithPageOpen(String pageToOpen) {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();

        if (pageToOpen.equals("Coders Guru Login Page"))

            driver.get(loginPageUrl);
        else System.out.println("Wrong keyword: " + pageToOpen);

    }

    @And("user input (.*) into (.*) field")
    public void userInputLoginIntoLoginField(String value, String fieldType) {
        WebElement inputUsername = driver.findElement(By.id("username"));
        WebElement inputPassword = driver.findElement(By.id("password"));
        switch (fieldType) {
            case "username":
                inputUsername.sendKeys(value);
                break;
            case "password":
                inputPassword.sendKeys(value);
                break;
            default:
                System.out.println("Wrong field type: " + fieldType);

        }

