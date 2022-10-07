package TestCasesDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import nopCommercePages.P01_homePage;
import org.junit.Assert;

import java.util.ArrayList;

import static TestCasesDefinitions.Hooks.driver;

public class D13_followUs {
    P01_homePage homePage = new P01_homePage(driver);

    @And("user press on facebook link.")
    public void user_press_on_facebookLink() {
        homePage.facebookLink().click();
    }

    @Then("facebook opens in new tab.")
    public void facebook_open() {
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
        driver.close();
        driver.switchTo().window(newTab.get(0));
    }

    @And("user press on twitter link.")
    public void user_press_on_twitterLink() {
        homePage.twitterLink().click();
    }

    @Then("twitter opens in new tab.")
    public void twitter_open() {
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
        driver.close();
        driver.switchTo().window(newTab.get(0));
    }

    @And("user press on rss link.")
    public void user_press_on_rssLink() {
        homePage.rssLink().click();
    }

    @Then("rss opens in new tab.")
    public void rss_open() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/news/rss/1");
        driver.navigate().back();
    }

    @And("user press on youtube link.")
    public void user_press_on_youtubeLink() {
        homePage.youtubeLink().click();
    }

    @Then("youtube opens in new tab.")
    public void youtube_open() {
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
        driver.close();
        driver.switchTo().window(newTab.get(0));
    }
}
