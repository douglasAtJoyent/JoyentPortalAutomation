package com.joyent.portalautomation.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * This represents the navigation pane on the left hand side. It will have many children, since we want navigation on
 * most of the pages
 *
 * This will represent the left hand side navigation.
 *
 * @author DouglasAnderson
 *
 */
public class NavigationPane {
    /**
     * Logger for the class.
     */
    private static final Logger LOGGER = Logger.getLogger(NavigationPane.class);
    /**
     * Static for finding menu item.
     */
    public static final String DASHBOARD = "Dashboard";
    /**
     * Static for finding menu item.
     */
    public static final String COMPUTE = "Compute";
    /**
     * Static for finding menu item.
     */
    public static final String NETWORK = "Network";
    /**
     * Static for finding menu item.
     */
    public static final String STORAGE = "Storage";
    /**
     * Static for finding menu item.
     */
    public static final String USEAGE = "Usage";
    /**
     * Static for finding menu item.
     */
    public static final String SUPPORT_PLANS = "Support Plans";
    /**
     * Static for finding menu item.
     */
    public static final String DOCUMENTATION = "Documentation";
    /**
     * Static for finding menu item.
     */
    public static final String ACCESS = "Access";

    /**
     * Driver to access the page.
     */
    private WebDriver driver;

    /**
     * This is the default constructor for this page.
     *
     * @param driver - driver to be used.
     */
    public NavigationPane(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * This will get a the list of Webelements attached to the menu.
     *
     * @return - a list of Webelements to select that are nonempty elements.
     * @param menuItem - the name of the menu ite to get, use the statics.
     */
    private WebElement getMenuItemTopLevel(final String menuItem) {
        WebElement mainWrapper = driver.findElement(By.className("main-wrapper"));
        WebElement sidebarMenu = mainWrapper.findElement(By.className("sidebar-menu"));
        List<WebElement> menuItems = sidebarMenu.findElements(By.className("title"));
        for (WebElement child : menuItems) {
            if (child.getText().trim().equals(menuItem)) {
                return child;
            }
        }
        LOGGER.debug(String.format("MENU ITEM NOT FOUND %s", menuItem));
        return null;
    }

    /**
     * Navigate to the Dashboard page.
     *
     * @return a DashboardPage
     */
    public DashboardPage navigateToDashboard() {
        WebElement menuItem = getMenuItemTopLevel(DASHBOARD);
        menuItem.click();
        return PageFactory.initElements(driver, DashboardPage.class);
    }

    /**
     * Clicks on the Compute at the top level.
     *
     * @return - ComputePage
     */
    public ComputePage navigateToComputePage() {
        WebElement menuItem = getMenuItemTopLevel(COMPUTE);
        menuItem.click();
        return PageFactory.initElements(driver, ComputePage.class);
    }

    /**
     * Clicks on the Network at the top level.
     *
     * @return - NetworkPage
     */
    public NetworkPage navigateToNetworkPage() {
        WebElement menuItem = getMenuItemTopLevel(NETWORK);
        menuItem.click();
        return PageFactory.initElements(driver, NetworkPage.class);
    }

    /**
     * Clicks on the Network at the top level.
     *
     * @return - StoragePage
     */
    public StoragePage navigateToStoragePage() {
        WebElement menuItem = getMenuItemTopLevel(STORAGE);
        menuItem.click();
        return PageFactory.initElements(driver, StoragePage.class);
    }

    /**
     * Clicks on the Network at the top level.
     *
     * @return - SpendPage
     */
    public SpendPage navigateToUseage() {
        WebElement menuItem = getMenuItemTopLevel(USEAGE);
        menuItem.click();
        return PageFactory.initElements(driver, SpendPage.class);
    }

    /**
     * Clicks on the Network at the top level.
     *
     * @return - SupportPlanPage
     */
    public SupportPlanPage navigateToSupportPlans() {
        WebElement menuItem = getMenuItemTopLevel(SUPPORT_PLANS);
        menuItem.click();
        return PageFactory.initElements(driver, SupportPlanPage.class);
    }

    /**
     * Clicks on the Network at the top level.
     *
     * @return - AccessPage
     */
    public AccessPage navigateToAccessPage() {
        WebElement menuItem = getMenuItemTopLevel(ACCESS);
        menuItem.click();
        return PageFactory.initElements(driver, AccessPage.class);
    }

    /**
     * Clicks on the Network at the top level.
     *
     * @return - DocumentationPage
     */
    public DocumentationPage navigateToDocumentationPage() {
        WebElement menuItem = getMenuItemTopLevel(COMPUTE);
        menuItem.click();
        return PageFactory.initElements(driver, DocumentationPage.class);
    }

}
