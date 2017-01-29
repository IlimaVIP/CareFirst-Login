import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		@Test(priority=1)
		public void i_want_to_open_FireFox_and_start_application() throws IOException{
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://individual.carefirst.com/individuals-families/home.page");
		    TakesScreenshot ts=(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(source, new File("./Screenshots/carefirst.png"));
			//add asserton for CareFirst
		
		}

		@When("^I click on search button it should click$")
		@Test(priority=2)
		public void i_click_on_search_button_it_should_click() throws IOException, InterruptedException {
		    driver.findElement(By.xpath(".//*[@id='1442093000057']/div/div[3]/p/a")).click();
		    Thread.sleep(3000);
		    TakesScreenshot ts=(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(source, new File("./Screenshots/carefirstlog.png"));
		
		   }

		@Then("^close the browser$")
		@AfterMethod
		public void close_the_browser() throws Throwable {
		    driver.close();
		}
        


	

}
