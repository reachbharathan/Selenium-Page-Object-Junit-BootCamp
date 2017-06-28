package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientsPage {
    private static WebDriver driver;

    public ClientsPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement searchText() {
        return driver.findElement(By.id("search"));
    }

    private WebElement searchBtn() {
        return driver.findElement(By.className("searchBtn"));
    }

    private WebElement selectClientBtn() {
        return driver.findElement(By.linkText("Select Client"));
    }

    private WebElement editClientDetailsBtn() {
        return driver.findElement(By.linkText("Edit Client Details"));
    }

    private WebElement clientContactPersonNameTxt() {
        return driver.findElement(By.id("client_contact_person_name"));
    }

    private WebElement clientAddressTxt() {
        return driver.findElement(By.id("client_address"));
    }

    private WebElement updateClientBtn() {
        return driver.findElement(By.name("commit"));
    }

    private WebElement quotationsTabBtn() {
        return driver.findElement(By.linkText("Quotations"));
    }

    private WebElement addNewQuotation() {
        return driver.findElement(By.partialLinkText("Add New Quotation"));
    }

    private WebElement orderPlacedByTxt() {
        return driver.findElement(By.id("quotation_order_placed_by"));
    }

    private WebElement eventNameTxt() {
        return driver.findElement(By.id("quotation_event_name"));
    }

    private WebElement eventDateTxt() {
        return driver.findElement(By.id("quotation_event_date"));
    }

    private WebElement updateQuotationBtn() {
        return driver.findElement(By.name("commit"));
    }

    public void searchClient(String searchString) {
        searchText().sendKeys(searchString);
        searchBtn().click();
        selectClientBtn().click();
    }

    public void editClientDetails(String contactPersonName, String address) {
        editClientDetailsBtn().click();
        clientContactPersonNameTxt().clear();
        clientContactPersonNameTxt().sendKeys(contactPersonName);
        clientAddressTxt().clear();
        clientAddressTxt().sendKeys(address);
        updateClientBtn().click();
    }

    public void addNewQuotation(String orderPlacedByName, String eventNameValue, String eventDateValue) {
//        editClientDetailsBtn().click();
        quotationsTabBtn().click();
        addNewQuotation().click();
        orderPlacedByTxt().sendKeys(orderPlacedByName);
        eventNameTxt().sendKeys(eventNameValue);
        eventDateTxt().sendKeys(eventDateValue);
        updateQuotationBtn().click();
        driver.switchTo().alert().accept();
    }
}
