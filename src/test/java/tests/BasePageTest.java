package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BasePageTest {

    public static WebDriver driver;

    public ClientsPage clientsPage;
    public LoginPage loginPage;
    public LogoutPage logoutPage;
    public HomePage homePage;
    public NavigationBar navigationBar;
    public TaxesPage taxesPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("http://accountsdemo.herokuapp.com");
        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        clientsPage = new ClientsPage(driver);
        clientsPage = new ClientsPage(driver);
        homePage = new HomePage(driver);
        navigationBar = new NavigationBar(driver);
        taxesPage = new TaxesPage(driver);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
