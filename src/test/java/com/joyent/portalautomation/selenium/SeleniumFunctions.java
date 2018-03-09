package com.joyent.portalautomation.selenium;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.joyent.portalautomation.config.PortalProperties;
import com.joyent.portalautomation.pages.LoginPage;
import com.joyent.portalautomation.pages.NavigationPane;

public class SeleniumFunctions {

    public static WebDriver driver = null;
    public static WebDriverWait waitVar = null;

    //
    public static String baseURL = "https://portalprodnew.joyent.com/";

    public void createDriver() throws MalformedURLException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/DouglasAnderson/Documents/workspace/JoyentPortalAutomation/drivers/chromedriver");
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseURL);
        waitVar = new WebDriverWait(driver, 15);
    }

    public void teardown() {
        driver.close();
        driver.quit();
    }
    
    /**
     * Get the login page. This is the entry point to the portal.
     * 
     * @return
     */
    public LoginPage getLoginPage() { 
        return PageFactory.initElements(driver, LoginPage.class);
    }
    
    public NavigationPane getNavigationPane() { 
        return PageFactory.initElements(driver, NavigationPane.class); 
    }
    
    public void ishomepageDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign in")));
        driver.findElement(By.linkText("Sign in")).isDisplayed();
    }

    public void isloginsectionDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(By.className("form-control")));
        waitVar.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
    }
    
    /**
     * This will replace anything surrounded by ${} with the property of the same name.
     * This assumes that there is only 1 replacement inside the string. 
     * @param original
     * @return
     * @throws IOException 
     * @throws FileNotFoundException 
     */
    public String replaceWithProperty(String original) throws FileNotFoundException, IOException { 
        Properties props =  PortalProperties.getProperties();
        String second = original.split("\\{")[1];
        String key = second.split("\\}")[0];
        System.out.println("KEY : "  + key);
        String replaceValue = props.getProperty(key);
        System.out.println(props.getProperty("default.username"));
        return original.replace("{" + key + "}",replaceValue);
    }

}
