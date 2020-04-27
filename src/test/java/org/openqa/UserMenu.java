package org.openqa;
import java.util.ArrayList;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserMenu{
	
	public static void User_Menu() throws InterruptedException
	{
		
		
		WebDriver driver= null;
		WebDriverManager.chromiumdriver().setup();
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\anasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		//Get the url of the page
		driver.get("https://developer.salesforce.com/signup");
		Thread.sleep(3000);
		
		//Window maximize
		driver.manage().window().maximize();
		
		
		//TCO1:  Validate user name ---give user name and do not give password
				driver.get("https://login.salesforce.com");
			
		
				WebElement ele_username1=driver.findElement(By.xpath("//input[@id='username']"));
				ele_username1.sendKeys("valli.pa@salesforce.com");
				System.out.println(ele_username1);
				WebElement ele_password=driver.findElement(By.xpath("//input[@id='password']"));
				ele_password.sendKeys("Jaihanuman1234");
				
				//Click on the login button
				WebElement ele_login=driver.findElement(By.xpath("//input[@id='Login']"));
				ele_login.click();
				
	}
	public static void droplist()
	{
	
		System.out.println(" Testcase 5 is getting executed...");
		//Test case 5 is user drop down list
		//driver.get("https://na172.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom");
		
		WebElement driver=null;
		
		WebElement ele_usermenu=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		ele_usermenu.click();
		
		Select Droplist = new Select(ele_usermenu);
		Droplist.selectByVisibleText("mysettings");
		System.out.println("droplist exists");
		System.out.println("Testcase 5 is executed...");
	}
		
		
				
	
	
	public static void main(String[] args) throws InterruptedException
	{
		UserMenu u_menu = new UserMenu();
		User_Menu();
		droplist();
		
		
	}

}
