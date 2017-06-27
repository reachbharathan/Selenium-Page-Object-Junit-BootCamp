package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step1RuggedTest {

    public WebDriver driver;

    @Test
    public void testEditAccount() {
        login();
        searchClient();
        driver.findElement(By.linkText("Edit Client Details")).click();
        driver.findElement(By.id("client_contact_person_name")).clear();
        driver.findElement(By.id("client_contact_person_name")).sendKeys("ThoughtworksNew");
        driver.findElement(By.id("client_address")).clear();
        driver.findElement(By.id("client_address")).sendKeys("twAddressNew");
        driver.findElement(By.name("commit")).click();
        logout();
    }

    @Test
    public void testAddQuotationForClient() {
        login();
        searchClient();
        driver.findElement(By.linkText("Quotations")).click();
        driver.findElement(By.partialLinkText("Add New Quotation")).click();
        driver.findElement(By.id("quotation_order_placed_by")).sendKeys("Quotation1");
        driver.findElement(By.id("quotation_event_name")).sendKeys("Event1");
        driver.findElement(By.id("quotation_event_date")).sendKeys("30-12-2016");
        updateQuotationDetails();
        logout();
    }

    @Test
    public void testServiceTaxSearch(){
        login();
        driver.findElement(By.linkText("TAXES")).click();
        driver.findElement(By.linkText("SERVICE TAXES")).click();
        driver.findElement(By.id("start_date")).sendKeys("16-02-2017");
        driver.findElement(By.id("end_date")).sendKeys("17-02-2017");
        driver.findElement(By.cssSelector("#end_date + input")).click();
        logout();
    }

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    private void login() {
        driver.navigate().to("http://accountsdemo.herokuapp.com");
        driver.findElement(By.id("user_email")).sendKeys("letslearnandshare@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("!abcd1234");
        driver.findElement(By.name("commit")).click();
    }

    private void logout() {
        driver.findElement(By.cssSelector("span.glyphicon-log-out")).click();
    }

    private void updateQuotationDetails() {
        driver.findElement(By.name("commit")).click();
        driver.switchTo().alert().accept();
    }

    private void searchClient() {
        driver.findElement(By.linkText("CLIENTS")).click();
        driver.findElement(By.id("search")).sendKeys("Thoughtworks");
        driver.findElement(By.className("searchBtn")).click();
        driver.findElement(By.linkText("Select Client")).click();
    }
}
