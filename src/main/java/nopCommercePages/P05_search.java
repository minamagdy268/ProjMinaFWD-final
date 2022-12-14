package nopCommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class P05_search extends PageBase {

    public P05_search(WebDriver driver) {
        super(driver);
    }

    // Defines Lenovo Idea Centre 600 Laptop Element.
    public WebElement lenovoIdeaCentre600Ele() {
        By lenovoIdeaCentre600 = By.cssSelector("h2[class=\"product-title\"] > a[href=\"/lenovo-ideacentre-600-all-in-one-pc\"]");
        return driver.findElement(lenovoIdeaCentre600);
    }
}
