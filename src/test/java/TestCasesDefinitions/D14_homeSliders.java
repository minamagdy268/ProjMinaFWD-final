package TestCasesDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nopCommercePages.P01_homePage;
import org.testng.Assert;


import static TestCasesDefinitions.Hooks.driver;

public class D14_homeSliders {
    P01_homePage homePage = new P01_homePage(driver);
    
    @When("User clicks on first slider button")
    public void user_press_on_firstSlider()   {
        driver.navigate().to("https://demo.nopcommerce.com/");
        homePage.firstSliderButton().click();
    }
    @And("User click on first slider link")
    public void user_clicks_firstSlider_link() {
        homePage.firstSliderLink().click();
    }
    @Then("User redirected to first slider link")
    public void user_redirected_firstSlider_link(){
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://demo.nopcommerce.com/nokia-lumia-1020");
    }
    @When("User select the second slider button")
    public void user_press_on_secondSlider()   {
        homePage.secondSliderButton().click();
    }
    @And("User click on second slider link")
    public void user_clicks_secondSlider_link()   {
        homePage.secondSliderLink().click();
    }
    @Then("User is redirected to second slider link")
    public void user_redirected_secondSlider_link(){
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://demo.nopcommerce.com/iphone-6");
    }
}
