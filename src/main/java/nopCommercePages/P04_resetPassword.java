package nopCommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P04_resetPassword extends PageBase {

    public P04_resetPassword(WebDriver driver) {
        super(driver);
    }

    public String resetPasswordURL() {
        return "https://demo.nopcommerce.com/passwordrecovery";
    }

    public WebElement recoverPasswordButton() {
        By recoverPasswordButton = By.cssSelector("button[class=\"button-1 password-recovery-button\"]");
        return driver.findElement(recoverPasswordButton);
    }

    public WebElement resetPasswordSuccessTxt() {
        By resetPasswordSuccessTxt = By.cssSelector("p[class=\"content\"]");
        return driver.findElement(resetPasswordSuccessTxt);
    }

    public WebElement emailNotFoundBarNotif() {
        By emailNotFoundBarNotif = By.cssSelector("div[class=\"bar-notification error\"] > p[class=\"content\"]");
        return driver.findElement(emailNotFoundBarNotif);
    }
}
