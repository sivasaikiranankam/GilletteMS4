package com.Gillette.StepDefination;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Gillette.PageObjects.Gillette;
import com.Gillette.ResuableComponents.Base;
import com.Gillette.ResuableComponents.ReusableMethods;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base {

    @Given("^Open Browser$")
    public void open_Browser() throws Throwable {
    	driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		logger.info("driver is intialized");
    }
        
    
    @And("^navigate to given url$")
    public void navigate_to_given_url() throws Throwable {
    	OpenUrl();
    	logger.info("Url opened");
    	
    }

    @When("^we Enter \"([^\"]*)\" in searchbox and search$")
    public void we_enter_something_in_searchbox_and_search(String strArg1) throws Throwable {
    	 Gillette g=new Gillette (driver);
    	 Thread.sleep(5000);
    	 g.clickingSearchBox().click();
    	 logger.info("clicked on search icon");
    	 g.searchingShavingcream().sendKeys(strArg1);
    	 logger.info("Entered shaving cream in searchbox");
    	 g.searchingShavingcream().sendKeys(Keys.ENTER);
    	 
       
    }

    @Then("^check item is present or not$")
    public void check_item_is_present_or_not() throws Throwable {
    	 Gillette g=new Gillette (driver);
    
    	if( g.verifyTitle().isDisplayed())
    	{
    		System.out.println("Shaving cream is displayed");
    		 logger.info("shaving cream is displayed");
    	}
    	else
    	{
    		System.out.println("Shaving cream is Not displayed");
    	}
    	 
        
    }
    @When("^Click on shop all products$")
    public void click_on_shop_all_products() throws Throwable {
    	 Gillette g=new Gillette (driver);
    	 g.ShopallProducts().click();
    	 logger.info("clicked on shop all products icon");
    	 
    }

    @Then("^verify wheather rasors and trimmers are present or not$")
    public void verify_wheather_rasors_and_trimmers_are_present_or_not() throws Throwable {
    	
    	 Gillette g=new Gillette (driver);
      if(g.RasorsAndTrimmers().isDisplayed())
      {
    		System.out.println("rasors and trimmers is displayed");
    		 logger.info("rasors and trimmers is displayed");
      }
      else
      {
    	  System.out.println("rasors and trimmers is not  displayed");
      }
    }
    
    @When("^click on terms and condtions in footer$")
    public void click_on_terms_and_condtions_in_footer() throws Throwable {
    	 Gillette g=new Gillette (driver);
    	 g.TermasAndConditions().click();
    	 logger.info("Clicked on terms and condition icon");
    }

    @Then("^verify code of conduct is present or not$")
    public void verify_code_of_conduct_is_present_or_not() throws Throwable {
    	 Gillette g=new Gillette (driver);
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            driver.switchTo().window(handle);
            if(g.CodeOfConduct().isDisplayed())
            {
            	System.out.println("Code of conduct is displayed");
            }
            else
            {
            	System.out.println("Code of conduct is not  displayed");
            }
        }
    }
    }


   

}

