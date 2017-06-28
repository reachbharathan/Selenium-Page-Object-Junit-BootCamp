package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

    private static WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement logoutBtn() {
        return driver.findElement(By.cssSelector("span.glyphicon-log-out"));
    }

    public void logout() {
        logoutBtn().click();
    }
}
