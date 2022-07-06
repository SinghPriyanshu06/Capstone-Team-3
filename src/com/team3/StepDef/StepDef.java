package com.team3.StepDef;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.team3.Utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {
	public static WebDriver driver;
	PropertiesFileReader obj= new PropertiesFileReader();  
    
	@Given("^open chrome browser and enter URL$")
	public void open_chrome_browser_and_enter_url() throws Throwable 
	{
	  
		Properties properties = obj.getProperty();   
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\OneDrive\\Desktop\\Team_3_Capstone-main\\Driver\\CHROME\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();			
		//driver.get(properties.getProperty("browser.baseURL"));
		driver.get("http://uitestingplayground.com/");
		Thread.sleep(3000);	 
	}
	
	@When("^opens website$")
	public void get_title() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^validate title$")
	public void validate_title() throws Throwable 
	{
		String expectedtitle = "UI Test Automation Playground";
	  	String actualtitle= driver.getTitle();
	  	Assert.assertEquals(" UI Test automation  play ground page is not available", expectedtitle, actualtitle);
	}

	
	
	@Given("^click on dynamic id$")
	public void click_dynamic() throws Throwable 
	{
	  
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[1]/h3/a")).click();
	}

	@When("^opens page$")
	public void open_page() throws Throwable 
	{
		 driver.getTitle();
	
	}

	@Then("^validate page title$")
	public void validate_page_title() throws Throwable 
	{
		String expectedtitle = "Dynamic ID";
	  	String actualtitle= driver.getTitle();
	  	
	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
	  	driver.navigate().back();
	}

	
	@Given("^click on ClassAttribute$")
	public void click_classattribute() throws Throwable 
	{
	  
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/h3/a")).click();
	}

	@When("^opens page ClassAttribute$")
	public void open_page_classattribute() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^validate page title of ClassAttribute and button$")
	public void validate_page_title_classattribute() throws Throwable 
	{
		String expectedtitle = "Class Attribute";
	  	String actualtitle= driver.getTitle();
		Assert.assertEquals("Class Attribute page is not availble", expectedtitle, actualtitle);
		driver.findElement(By.className("btn-primary")).click();
		driver.switchTo().alert().accept();
	  	driver.navigate().back();
	}
	
	@Given("^click on HiddenLayer$")
	public void click_hiddenlayer() throws Throwable 
	{
	  
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[3]/h3/a")).click();
	}

	@When("^opens page HiddenLayer$")
	public void open_page_hiddenlayer() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^validate page title of HiddenLayer and button testing$")
	public void validate_page_title_hiddenlayer() throws Throwable 
	{
		String expectedtitle = "Hidden Layers";
	  	String actualtitle= driver.getTitle();
	  	Assert.assertEquals("Hidden Layers page  is not avilable", expectedtitle, actualtitle);
	  	driver.findElement(By.className("btn-success")).click();
	   	driver.navigate().back();
	}


	@Given("^click on LoadDelay$")
	public void click_localdelay() throws Throwable 
	{
	  
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[4]/h3/a")).click();
		Thread.sleep(3000);	
	}

	@When("^opens page LoadDelay$")
	public void open_page_loaddelayr() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^test the button after delay$")
	public void test_the_delay() throws Throwable 
	{
		String expectedtitle = "Load Delays";
	  	String actualtitle= driver.getTitle();
	  	Assert.assertEquals(" Load Delays page  is not avilable", expectedtitle, actualtitle);
	  	driver.findElement(By.className("btn-primary")).click();
	  	driver.navigate().back();
	}
	@Given("^click on AJAX$")
	public void click_AJAX() throws Throwable 
	{
	  
		driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[2]/div[1]/h3/a")).click();
		Thread.sleep(3000);	
	}

	@When("^opens page AJAX$")
	public void open_page_AJAX() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^test the button after opeaning AJAX$")
	public void test_the_AJAXButton() throws Throwable 
	{
		String expectedtitle = "AJAX Data";
	  	String actualtitle= driver.getTitle();
	  	Assert.assertEquals("AJAX page  is not avilable", expectedtitle, actualtitle);
	  	driver.findElement(By.className("btn-primary")).click();
	  	driver.navigate().back();
	}
	@Given("^click on Client Side Delay$")
	public void click_Client_Side_Delay() throws Throwable 
	{
	  
		driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[2]/div[2]/h3/a")).click();
		Thread.sleep(3000);	
	}

	@When("^opens page Client Side Delay$")
	public void open_page_Client_Side_Delay() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^test the button after opeaning Client Side Delay$")
	public void test_the_Client_Side_Delay() throws Throwable 
	{
		String expectedtitle = "Client Side Delay";
	  	String actualtitle= driver.getTitle();
	  	Assert.assertEquals("Client Side Delay page  is not avilable", expectedtitle, actualtitle);
	  	driver.findElement(By.className("btn-primary")).click();
	  	driver.navigate().back();
	}
	@Given("^click on Click button$")
	public void click_Click() throws Throwable 
	{
	  
		driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[2]/div[3]/h3/a")).click();
		Thread.sleep(3000);	
	}

	@When("^opens page Click$")
	public void open_page_Click() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^test the DOM Click Event button$")
	public void test_the_Click() throws Throwable 
	{
		String expectedtitle = "Click";
	  	String actualtitle= driver.getTitle();
	  	Assert.assertEquals("Click page  is not avilable", expectedtitle, actualtitle);
	  	driver.findElement(By.id("badButton")).click();
	  	driver.navigate().back();
	}
	@Given("^click on Text Input$")
	public void click_Text_Input() throws Throwable 
	{
	  
		driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[2]/div[4]/h3/a")).click();
		Thread.sleep(3000);	
	}

	@When("^opens page Text Input$")
	public void open_page_Text_Input() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^test the button after opeaning Text Input$")
	public void test_the_Text_Input() throws Throwable 
	{
		String expectedtitle = "Text Input";
	  	String actualtitle= driver.getTitle();
	  	Assert.assertEquals("Click page  is not avilable", expectedtitle, actualtitle);
	  	driver.findElement(By.id("newButtonName")).sendKeys("New Button",Keys.ENTER);
	  	driver.findElement(By.id("updatingButton")).click();
	  	driver.navigate().back();
	  	driver.close();
	}
	
}
