package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleFooterLinks1005A {
	private	WebDriver driver;	
	@Given("I go to Google Home page")
	public void i_go_to_google_home_page() throws Throwable {
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe"); 
		
		
		 
		driver = new ChromeDriver(); 
		 // For ChromeBrowser 
		  driver.get("https://www.google.com");
		  
		  Thread.sleep(5000);
		 // driver.close();
	}

	@When("I click on the Privacy link")
	public void i_click_on_the_privacy_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.linkText("Privacy")).click();
		
	}

	@Then("I see the Privacy page")
	public void i_see_the_privacy_page() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException()
		Assert.assertEquals(driver.getPageSource().contains("Privacy"),true);
		Thread.sleep(20000);
		driver.close();
	}	
	

}
