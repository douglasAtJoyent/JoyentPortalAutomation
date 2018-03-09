package com.joyent.portalautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author DouglasAnderson
 *
 */
public class LoginPage {
    /**
     * driver to be used.
     */
    private final WebDriver driver;

    /**
     * Username field.
     */
    @FindBy(how = How.NAME, using = "username")
    private WebElement userName;
    /**
     * Password field.
     */
    @FindBy(how = How.NAME, using = "password")
    private WebElement password;
    /**
     * Button for signing in.
     */
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement signInButton;

    /**
     * Link to reset by email.
     */
    @FindBy(how = How.LINK_TEXT, using = "Reset via email")
    private WebElement resetViaEmail;

    /**
     * Create Account link.
     */
    @FindBy(how = How.LINK_TEXT, using = "Create account")
    private WebElement createAccount;

    /**
     * Error message.
     */
    @FindBy(how = How.CLASS_NAME, using = "error")
    private WebElement errorMessage;

    /**
     * Default constructor.
     *
     * @param driver - driver to be used
     */
    public LoginPage(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * This will login assuming a valid user name and password.
     *
     * @param uname - User name to be used.
     * @param passwd - Passowrd to be used.
     * @return - the landing page for the application.
     */
    public LandingPage login(final String uname, final String passwd) {
        this.userName.sendKeys(uname);
        this.password.sendKeys(passwd);
        this.signInButton.click();
        return PageFactory.initElements(driver, LandingPage.class);
    }

    /**
     * This will login assuming a invalid credentials so it will give back a login page.
     *
     * @param uname - User name to be used.
     * @param passwd - Password to be used.
     * @return - the landing page for the application.
     */
    public LoginPage loginExpectError(final String uname, final String passwd) {
        this.userName.click();
        this.userName.sendKeys(uname);
        this.password.click();
        this.password.sendKeys(passwd);
        this.signInButton.click();
        return PageFactory.initElements(driver, LoginPage.class);
    }

    /**
     * @return - true if the element is displayed.
     */
    public boolean isUserNameDisplayed() {
        return userName.isDisplayed();
    }

    /**
     * @return - true if the element is displayed.
     */
    public boolean isPasswordDisplayed() {
        return password.isDisplayed();
    }

    /**
     * @return - true if the element is displayed.
     */
    public boolean isSignInButtonDisplayed() {
        return signInButton.isDisplayed();
    }

    /**
     * @return - true if the element is displayed.
     */
    public boolean isResetViaEmailDisplayed() {
        return this.resetViaEmail.isDisplayed();
    }

    /**
     *
     * @return - true if the element is displayed.
     */
    public boolean isCreateAccountDisplayed() {
        return this.createAccount.isDisplayed();
    }

    /**
     * This will return true when the given text is displayed in the error message banner.
     *
     * @param errorText - The error text that should be displayed.
     * @return - returns true if the error message is displayed and correct.
     */
    public boolean isErrorMessageDisplayed(final String errorText) {
        if (errorMessage.isDisplayed()) {
            System.out.println("Found : " + errorMessage.getText() + " Expected : " + errorText);
            return errorMessage.getText().trim().equalsIgnoreCase(errorText.trim());
        }
        System.out.println("Did not find the error");
        return false;
    }

    /**
     * @return the userName
     */
    public final WebElement getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public final void setUserName(final WebElement userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public final WebElement getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public final void setPassword(final WebElement password) {
        this.password = password;
    }

    /**
     * @return the signInButton
     */
    public final WebElement getSignInButton() {
        return signInButton;
    }

    /**
     * @param signInButton the signInButton to set
     */
    public final void setSignInButton(final WebElement signInButton) {
        this.signInButton = signInButton;
    }

    /**
     * @return the resetViaEmail
     */
    public final WebElement getResetViaEmail() {
        return resetViaEmail;
    }

    /**
     * @param resetViaEmail the resetViaEmail to set
     */
    public final void setResetViaEmail(final WebElement resetViaEmail) {
        this.resetViaEmail = resetViaEmail;
    }

    /**
     * @return the createAccount
     */
    public final WebElement getCreateAccount() {
        return createAccount;
    }

    /**
     * @param createAccount the createAccount to set
     */
    public final void setCreateAccount(final WebElement createAccount) {
        this.createAccount = createAccount;
    }

    /**
     * @return the errorMessage
     */
    public final WebElement getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public final void setErrorMessage(final WebElement errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the driver
     */
    public final WebDriver getDriver() {
        return driver;
    }

}
