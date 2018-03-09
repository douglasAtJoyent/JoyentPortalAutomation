package com.joyent.portalautomation.pages;

import org.openqa.selenium.WebDriver;

/**
 * @author DouglasAnderson
 *
 */
public class DashboardPage extends NavigationPane {
    /**
     * These pages are a reflection of the individual pages, and should assume that when we are handed this page, that
     * we are in fact on this page.
     *
     * webdriver for use on this page.
     */
    private final WebDriver driver;

    /**
     * Default Constructor.
     * @param driver - webdirver to use.
     */
    public DashboardPage(final WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
