import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPage open() {
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        return this;
    }

    public RegisterPage enterFirstName(String firstName) {
        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public RegisterPage enterLastName(String lastName) {
        WebElement lastNameInput = driver.findElement(By.name("lastname"));
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public RegisterPage enterEmail(String email) {
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys(email);
        return this;
    }

    public RegisterPage enterTelephone(String telephone) {
        WebElement telephoneInput = driver.findElement(By.name("telephone"));
        telephoneInput.sendKeys(telephone);
        return this;
    }

    public RegisterPage enterPassword(String password) {
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(password);
        return this;
    }

    public RegisterPage enterConfirmPassword(String confirmPassword) {
        WebElement confirmPasswordInput = driver.findElement(By.name("confirm"));
        confirmPasswordInput.sendKeys(confirmPassword);
        return this;
    }

    public RegisterPage agreeToPrivacyPolicy() {
        WebElement privacyPolicyCheckbox = driver.findElement(By.name("agree"));
        privacyPolicyCheckbox.click();
        return this;
    }

    public void submitRegistration() {
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        registerButton.click();
    }
}
