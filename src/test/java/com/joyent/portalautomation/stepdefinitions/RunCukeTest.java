/**
 * 
 */
package com.joyent.portalautomation.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/joyent/portalautomation/features",
        glue = "com.joyent.portalautomation.stepdefinitions",
        plugin = { 
                    "pretty",
                    "html:target/cucumber",
                } 

        )
public class RunCukeTest {
}
