/**
 *
 */
package com.joyent.portalautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.joyent.portalautomation.pages.compute.CustomImagesPage;
import com.joyent.portalautomation.pages.compute.DockerImgesPage;
import com.joyent.portalautomation.pages.compute.DockerRegistriesPage;
import com.joyent.portalautomation.pages.compute.IntroductionPage;

/**
 * @author DouglasAnderson
 *
 */
public class ComputePage extends NavigationPane {
    /**
     * These pages are a reflection of the individual pages, and should assume that when we are handed this page, that
     * we are in fact on this page.
     *
     * Webdriver for use on this page.
     */
    private final WebDriver driver;

    /**
     * Default constructor.
     * @param driver - driver.
     */
    public ComputePage(final WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    /**
     * Uses the left pane to click on the introduction link.
     *
     * @return - The introduction page.
     */
    public IntroductionPage navigateToIntroductionPage() {
        return PageFactory.initElements(driver, IntroductionPage.class);
    }

    /**
     * Uses the left pane to click on the introduction link.
     *
     * @return customimagepage
     */
    public CustomImagesPage navigateToCustomImages() {
        return PageFactory.initElements(driver, CustomImagesPage.class);
    }

    /**
     * Uses the left pane to click on the introduction link.
     *
     * @return docker image page
     */
    public DockerImgesPage navigateToDockerImages() {
        return PageFactory.initElements(driver, DockerImgesPage.class);
    }

    /**
     * Uses the left pane to click on the introduction link.
     *
     * @return - registry page
     */
    public DockerRegistriesPage navigateToDockerRegistries() {
        return PageFactory.initElements(driver, DockerRegistriesPage.class);
    }

}
