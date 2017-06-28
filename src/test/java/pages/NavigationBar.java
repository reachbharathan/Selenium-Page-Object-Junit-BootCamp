package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class NavigationBar {

    private static WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement navigationBarMap(String navigationBarName) {
        String linkName;
        Map<String, String> navigationLinkMap = new HashMap<>();
        navigationLinkMap.put("clients", "CLIENTS");
        navigationLinkMap.put("taxes", "TAXES");
        linkName = navigationLinkMap.get(navigationBarName);
        return driver.findElement(By.linkText(linkName));
    }

    public void clickNavigationLink(String navigationLink) {
        navigationBarMap(navigationLink).click();
    }
}
