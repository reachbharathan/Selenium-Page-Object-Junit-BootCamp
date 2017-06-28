package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement userEmailText() {
        return driver.findElement(By.id("user_email"));
    }

    private WebElement userPasswordText() {
        return driver.findElement(By.id("user_password"));
    }

    private WebElement loginInBtn() {
        return driver.findElement(By.name("commit"));
    }

    public void login(String userName, String passWord) {
        userEmailText().sendKeys(userName);
        userPasswordText().sendKeys(passWord);
        loginInBtn().click();
    }
}
