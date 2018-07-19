import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private String url = "https://wro-tem-s-01.codersguru.pl/register/";
    private WebDriver driver;

    // konstruktor
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    public boolean isAt() {
        return driver.getCurrentUrl().equals(url);
    }

    public void registerNewIndividualUser() {
        Generate generate = new Generate();
        // Wprowadzamy dane użytkownika
        driver.findElement(By.id("fos_user_registration_form_email")).sendKeys(generate.email());
        driver.findElement(By.id("fos_user_registration_form_name")).sendKeys("Adam");
        driver.findElement(By.id("fos_user_registration_form_lastname")).sendKeys("Domzalski");
        driver.findElement(By.id("fos_user_registration_form_plainPassword_first")).sendKeys("password");
        driver.findElement(By.id("fos_user_registration_form_plainPassword_second")).sendKeys("password");
        driver.findElement(By.id("form_city")).sendKeys("Warszawa");
        driver.findElement(By.id("form_postal_code")).sendKeys("01-234");
        driver.findElement(By.id("form_street")).sendKeys("Dolna");
        driver.findElement(By.id("form_number")).sendKeys("123");

        // Zaznaczamy Zgodę na regulamin
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        // Klikamy przycisk Zarejestruj
        driver.findElement(By.id("register-submit-btn")).click();
    }
}