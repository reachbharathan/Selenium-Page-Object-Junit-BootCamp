package tests;

import org.junit.Test;
import pages.*;

public class Step1RuggedTest extends BasePageTest {

    public ClientsPage clientsPage;
    public LoginPage loginPage;
    public LogoutPage logoutPage;
    public HomePage homePage;
    public TaxesPage taxesPage;

    private String USER_NAME = "letslearnandshare@gmail.com";
    private String PASSWORD = "!abcd1234";

    @Test
    public void testEditAccount() {
        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        clientsPage = new ClientsPage(driver);
        clientsPage = new ClientsPage(driver);
        homePage = new HomePage(driver);

        loginPage.login(USER_NAME, PASSWORD);
        homePage.clickClientsLink();
        clientsPage.searchClient("Thoughtworks");
        clientsPage.editClientDetails("ThoughtworksNew", "twAddressNew");
        logoutPage.logout();
    }

    @Test
    public void testAddQuotationForClient() {
        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        homePage = new HomePage(driver);
        clientsPage = new ClientsPage(driver);

        loginPage.login(USER_NAME, PASSWORD);
        homePage.clickClientsLink();
        clientsPage.searchClient("Thoughtworks");
        clientsPage.addNewQuotation("Quotation1", "Event1", "30-12-2016");
        logoutPage.logout();
    }

    @Test
    public void testServiceTaxSearch() {
        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        homePage = new HomePage(driver);
        taxesPage = new TaxesPage(driver);


        loginPage.login(USER_NAME, PASSWORD);
        homePage.clickTaxesLink();
        taxesPage.filterISTByDate("01-07-2017", "31-07-2017");
        logoutPage.logout();
    }
}
