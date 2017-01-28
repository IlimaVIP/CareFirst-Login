import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
        WebDriver driver;
	
		
		@Given("^I want to open FireFox and start application$")
		@Test
		public void i_want_to_open_FireFox_and_start_application(){
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://individual.carefirst.com/individuals-families/home.page");
		}

		@When("^I click on search button it should click$")
		public void i_click_on_search_button_it_should_click() {
		    
		}

		@Then("^close the browser$")
		@AfterMethod
		public void close_the_browser() throws Throwable {
		    driver.close();
		}
        


	

}
