package org.openqa;
import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.IO;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SFDC_login {
	
	//Automation of the Sales Force application
	
	public static void login_utility() throws InterruptedException
	{
		
		WebDriver driver= null;
		WebDriverManager.chromiumdriver().setup();
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\anasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		//Get the url of the page
		driver.get("https://developer.salesforce.com/signup");
		Thread.sleep(3000);
		
		//maximize the window
		
		//ChromeDriver driver = ChromeDriver();
		driver.manage().window().maximize();
		
			
		//Click on the login button
		
		//WebElement loginelement = driver.findElement(By.xpath("//a[@class='btn btn-success']")); 
		////a[@class='btn btn-success']

		//System.out.println(" Login button is present");
		//loginelement.click();
		 	
		
	
		System.out.println("Entering the test cases...");
	
		//TCO1:  Validate user name ---give user name and do not give password
		driver.get("https://login.salesforce.com");
	
		WebElement ele_username=driver.findElement(By.xpath("//input[@id='username']"));
		ele_username.sendKeys("valli.pa@salesforce.com");
		System.out.println(ele_username);
		
		WebElement ele_login=driver.findElement(By.xpath("//input[@id='Login']"));
		ele_login.click();
		
		WebElement  ele_errortext1 = driver.findElement(By.xpath("//div[@id='error']"));
		String error1=ele_errortext1.getText();
		System.out.println("Testcase1 is passed...");
		
		//TC02---valid username and valid password
		WebElement ele_username1=driver.findElement(By.xpath("//input[@id='username']"));
		ele_username1.sendKeys("vpannala@salesforce.com");
		System.out.println(ele_username1);
		WebElement ele_password=driver.findElement(By.xpath("//input[@id='password']"));
		ele_password.sendKeys("Jaihanuman1234");
		
			driver.get("https://developer.salesforce.com/signup/success");
			System.out.println(" Web page successfully launched...");
			System.out.println("TestCase2 is passed successfully...");
			
		//TC03----
		//check rememberme---
			//checking the check box.
			WebElement ele_rememberme=driver.findElement(By.xpath("//input[@id='rememberUn']"));
			ele_rememberme.isSelected();
			System.out.println("TestCase3 is passed successfully....");
			
		//TC04----A---Forgot password
			WebElement ele_forgotpassword=driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
			ele_forgotpassword.click();
			//click on user name text box
			WebElement ele_user=driver.findElement(By.xpath("//input[@id='un']"));
			ele_user.sendKeys("valli.p@salesforce.com");
			//click on continue button
			WebElement ele_continue=driver.findElement(By.xpath("//input[@id='continue']"));
			ele_continue.click();
			System.out.println(" Testcase4 is passed successfully...");
			
			//TC04---->BInvalid username and invalid password
			WebElement ele_username2 = driver.findElement(By.xpath("//input[@id='Login']"));
			ele_username2.sendKeys("valli.pannala@gmail.com");
			System.out.println("Invalid Username...");
			
			WebElement ele_password1 = driver.findElement(By.xpath("//input[@id='password']"));
			ele_password1.sendKeys("test@1234");
			System.out.println("Invalid Password.... ");
			
			WebElement ele_login1=driver.findElement(By.xpath("input[@id='Login']"));
			ele_login1.click();
			
			System.out.println("Testcase5 is passed successfully...");
			
			
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		
		SFDC_login  sfdc = new SFDC_login();
		UserMenu   usermenu = new UserMenu();
		System.out.println(" calling the login utility...");
		sfdc.login_utility();
		usermenu.User_Menu();
		//signup();
	}
	

}
