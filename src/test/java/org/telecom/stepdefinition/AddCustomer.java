package org.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
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
	
	@When("user needs to fill up the details by {int} dimensional list")
	public void user_needs_to_fill_up_the_details_by_dimensional_list(Integer int1, DataTable datas) {
	   
		List<String> details = datas.asList(String.class);
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.xpath("//input[@placeholder='FirstName']")).sendKeys(details.get(0));
		driver.findElement(By.xpath("//input[@placeholder='LastName']")).sendKeys(details.get(1));
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(details.get(2));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(details.get(3));
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(details.get(4));
	}
	
	@When("user needs to fill up the details by {int} dimensional map")
	public void user_needs_to_fill_up_the_details_by_dimensional_map(Integer int1, DataTable datas) {
	   
		Map<String, String> detailsmap = datas.asMap(String.class, String.class);
		
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.xpath("//input[@placeholder='FirstName']")).sendKeys(detailsmap.get("fname"));
		driver.findElement(By.xpath("//input[@placeholder='LastName']")).sendKeys(detailsmap.get("Lname"));
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(detailsmap.get("mail"));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(detailsmap.get("addr"));
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(detailsmap.get("phno"));
	}
	
	@When("user needs to fill up the details {string}{string}{string}{string}{string}")
	public void user_needs_to_fill_up_the_details(String fname, String lname, String mail, String addr, String phno) {
	    
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.xpath("//input[@placeholder='FirstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@placeholder='LastName']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(mail);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(addr);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(phno);
		
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
