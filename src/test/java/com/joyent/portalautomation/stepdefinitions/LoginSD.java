/**
 * 
 */
package com.joyent.portalautomation.stepdefinitions;

import com.joyent.portalautomation.pages.LandingPage;
import com.joyent.portalautomation.pages.LoginPage;
import com.joyent.portalautomation.selenium.SeleniumFunctions;

import cucumber.api.java.en.*;

import org.junit.Assert;

/**
 * @author DouglasAnderson
 *
 */
public class LoginSD {

    SeleniumFunctions sf = new SeleniumFunctions();
    LoginPage loginPage;
    
    
    /**
     * This will start the the driver open the browser, and navigate to the login page denoted by the URL in the config.
     * 
     * @throws Throwable
     */
    @Given("^you are on the sign in page$")
    public void you_are_on_the_sign_in_page() throws Throwable {
        sf.createDriver();
        loginPage = sf.getLoginPage();
    }

    @Then("^verify Username$")
    public void verify_Username() throws Throwable {
        Assert.assertTrue(loginPage.isUserNameDisplayed());
        
    }

    @Then("^verify Password;$")
    public void verify_Password() throws Throwable {
        Assert.assertTrue(loginPage.isPasswordDisplayed());
    }

    @Then("^verify SIGN IN$")
    public void verify_SIGN_IN() throws Throwable {
        Assert.assertTrue(loginPage.isSignInButtonDisplayed());
    }

    @Then("^verify Reset via email$")
    public void verifyResetViaEmail() throws Throwable {
        Assert.assertTrue(loginPage.isResetViaEmailDisplayed());
    }

    @Then("^verify Create Account$")
    public void verify_Create_Account() throws Throwable {
        Assert.assertTrue(loginPage.isCreateAccountDisplayed());
    }

    @Then("^login with the username \"([^\"]*)\" and password \"([^\"]*)\" and the error \"([^\"]*)\" should appear$")
    public void login_with_the_username_and_password_and_the_error_appear(String username, String password, String errorMessage) throws Throwable {
        LoginPage errorPage = loginPage.loginExpectError(username, password);
        Thread.sleep(5000);
        Assert.assertTrue(errorPage.isErrorMessageDisplayed(errorMessage));
    }
    
    @Then("kill the browser")
    public void killBrowser() { 
        sf.teardown();
    }
    
    @Then("^login with the username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void login(String username, String password) throws Throwable {
        System.out.println("UserName " + username + " Password : " + password);
        if(username.trim().contains("{")) { 
            username = sf.replaceWithProperty(username);
        }
        if(password.trim().contains("{")) { 
            password = sf.replaceWithProperty(password);
        }
        LandingPage landing = loginPage.login(username, password);
        // TODO: need to add validation to this method.
    }
    
}
