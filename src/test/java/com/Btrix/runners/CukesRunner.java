package com.Btrix.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(

            plugin={"json:target/cucumber.json", "html:target/default-cucumber-reports" },

            features ={"src/test/Resources/Features"},

            glue={"com/Btrix/StepDefinitions"},

            dryRun = false



    )
    public class CukesRunner{

    }





