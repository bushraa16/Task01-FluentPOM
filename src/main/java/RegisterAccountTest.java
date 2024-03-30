import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAccountTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.open()
                .enterFirstName("John")
                .enterLastName("Doe")
                .enterEmail("johndoe@example.com")
                .enterTelephone("1234567890")
                .enterPassword("password123")
                .enterConfirmPassword("password123")
                .agreeToPrivacyPolicy()
                .submitRegistration();

        // Add assertions or further steps after registration if needed

        driver.quit();
    }
}