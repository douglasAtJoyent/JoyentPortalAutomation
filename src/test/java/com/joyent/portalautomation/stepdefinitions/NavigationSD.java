/**
 * This is a set of step definitions that cover navigating through the menus, etc.
 */
package com.joyent.portalautomation.stepdefinitions;

import com.joyent.portalautomation.selenium.SeleniumFunctions;

import cucumber.api.java.en.Then;

/**
 * This will be the set of 
 * @author DouglasAnderson
 *
 */
public class NavigationSD {
    SeleniumFunctions sf = new SeleniumFunctions();
    

    @Then("^navigate to Dashboard$")
    public void navigateToDashboard() throws Throwable {
       sf.getNavigationPane().navigateToDashboard();
    }
    
    @Then("^navigate to Compute$")
    public void navigateToCompute() throws Throwable {
        sf.getNavigationPane().navigateToComputePage();
    }
    
    @Then("^navigate to Network$")
    public void navigateToNetwork() throws Throwable {
        sf.getNavigationPane().navigateToNetworkPage();
    }
    
    @Then("^navigate to Storage$")
    public void navigateStorage() throws Throwable {
        sf.getNavigationPane().navigateToStoragePage();
    }
    
    @Then("^navigate to Useage$")
    public void navigateToUseage() throws Throwable {
        sf.getNavigationPane().navigateToUseage();
    }
    
    @Then("^navigate to Support Plans$")
    public void navigateToSupportPlan() throws Throwable {
        sf.getNavigationPane().navigateToSupportPlans();
    }
    
    @Then("^navigate to Access$")
    public void navigateToAccess() throws Throwable {
        sf.getNavigationPane().navigateToAccessPage();
    }
    
    @Then("^navigate to Documentation$")
    public void navigate_to_the_Dashboard() throws Throwable {
        sf.getNavigationPane().navigateToDashboard();
    }
    
    
    
    @Then("^[Ww]ait (\\d+) seconds$")
    public void wait(int arg1) throws Throwable {
        Thread.sleep(arg1 * 1000);
    }
    
}
