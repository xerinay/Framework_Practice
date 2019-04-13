package com.briteERP.step_definitions;

import com.briteERP.page.HomePage;
import com.briteERP.page.SignInPage;
import com.briteERP.utilities.BrowserUtil;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_stepDefinitions {
    @Given("user on the SignIn page")
    public void user_on_the_SignIn_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }

    @When("user clicks signin button")
    public void user_clicks_signin_button() {
        SignInPage signInPage=new SignInPage();
        signInPage.signinButton.click();
    }

    @Then("user logs in using email and username")
    public void user_logs_in_using_email_and_username() {
        SignInPage signInPage=new SignInPage();
        String username= ConfigurationReader.getProperty("email");
        String password1= ConfigurationReader.getProperty("password");
          signInPage.login(username,password1);
        System.out.println("I am logged in");
    }

    @Then("the user clicks on Point of Sale")
    public void the_user_clicks_on_Point_of_Sale() {
        HomePage homePage=new HomePage();
        BrowserUtil.wait(10);
        homePage.pointOfSaleElement.click();
        System.out.println("i am in home page ");
    }


}
