package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement clientsTabBtn() {
        return driver.findElement(By.linkText("CLIENTS"));
    }

    private WebElement taxesTabBtn() {
        return driver.findElement(By.linkText("TAXES"));
    }

    public void clickClientsLink() {
        clientsTabBtn().click();
    }

    public void clickTaxesLink() {
        taxesTabBtn().click();
    }
}
