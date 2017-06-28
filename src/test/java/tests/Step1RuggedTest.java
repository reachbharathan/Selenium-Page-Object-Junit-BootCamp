package tests;

import org.junit.Test;

public class Step1RuggedTest extends BasePageTest {

    private String USER_NAME = "letslearnandshare@gmail.com";
    private String PASSWORD = "!abcd1234";

    @Test
    public void testEditAccount() {
        loginPage.login(USER_NAME, PASSWORD);
        homePage.clickClientsLink();
        clientsPage.searchClient("Thoughtworks");
        clientsPage.editClientDetails("ThoughtworksNew", "twAddressNew");
        logoutPage.logout();
    }

    @Test
    public void testAddQuotationForClient() {
        loginPage.login(USER_NAME, PASSWORD);
        homePage.clickClientsLink();
        clientsPage.searchClient("Thoughtworks");
        clientsPage.addNewQuotation("Quotation1", "Event1", "30-12-2016");
        logoutPage.logout();
    }

    @Test
    public void testServiceTaxSearch() {
        loginPage.login(USER_NAME, PASSWORD);
        homePage.clickTaxesLink();
        taxesPage.filterISTByDate("01-07-2017", "31-07-2017");
        logoutPage.logout();
    }
}
