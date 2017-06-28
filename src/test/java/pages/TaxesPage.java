package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaxesPage {

    private static WebDriver driver;

    public TaxesPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement incomingServiceTaxesLnk() {
        return driver.findElement(By.linkText("INCOMING SERVICE TAXES"));
    }

    private WebElement startDateTxt() {
        return driver.findElement(By.id("start_date"));
    }

    private WebElement endDateTxt() {
        return driver.findElement(By.id("end_date"));
    }

    private WebElement searchBtn() {
        return driver.findElement(By.cssSelector("#end_date + input"));
    }

    public void filterISTByDate(String startDate, String endDate) {
        incomingServiceTaxesLnk().click();
        startDateTxt().sendKeys(startDate);
        endDateTxt().sendKeys(endDate);
        searchBtn().click();
    }
}
