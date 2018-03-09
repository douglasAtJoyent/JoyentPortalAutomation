package com.joyent.portalautomation.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.joyent.portalautomation.pages.compute.InstancesPage;

/**
 * @author DouglasAnderson
 *
 */
public class LandingPage extends NavigationPane {
    /**
     * Logger for the class.
     */
    private static final Logger LOGGER = Logger.getLogger(LandingPage.class);

    /**
     * These pages are a reflection of the individual pages, and should assume that when we are handed this page, that
     * we are in fact on this page.
     *
     * webdriver for use on this page.
     */
    private final WebDriver driver;

    /**
     * This is the default constructor for this page.
     *
     * @param driver - driver to be used.
     */
    public LandingPage(final WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    /**
     * Uses the left pane to click on the introduction link.
     *
     * @return - The Instnces page.
     */
    public InstancesPage navigateToInstancesPage() {
        return PageFactory.initElements(driver, InstancesPage.class);
    }
}
