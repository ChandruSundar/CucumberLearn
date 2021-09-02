package org.telecom.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomer {
	
	static WebDriver driver;

	@Given("user launches telecom application")
	public void user_launches_telecom_application() {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("user clicks on telecom application")
	public void user_clicks_on_telecom_application() {
	    
		driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
	}

	@When("user needs to fill up the details")
	public void user_needs_to_fill_up_the_details() {
	    
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.xpath("//input[@placeholder='FirstName']")).sendKeys("Chandru");
		driver.findElement(By.xpath("//input[@placeholder='LastName']")).sendKeys("Sundar");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Chandru@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys("Pollachi");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9999999999");
		
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
	    
		WebElement custid = driver.findElement(By.xpath("//td[@align='center'][2]"));
		Assert.assertTrue(custid.isDisplayed());
	}
	

}
