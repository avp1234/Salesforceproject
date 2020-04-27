package org.openqa;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebElement;
import org.seleniumhq.jetty9.util.SocketAddressResolver.Sync;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC06_Myprofile {
	
	public static void main(String[] args) throws InterruptedException
	{
	
		
		//TC06---My profile settings
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromiumdriver().setup();
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\anasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		//Get the url of the page
		//driver.get("https://developer.salesforce.com/signup");
		//Thread.sleep(3000);
		
		
		//Valid username and valid password
		driver.get("https://login.salesforce.com");
		WebElement ele_username1=driver.findElement(By.xpath("//input[@id='username']"));
		ele_username1.sendKeys("valli.pa@salesforce.com");
		System.out.println(ele_username1);
		WebElement ele_password=driver.findElement(By.xpath("//input[@id='password']"));
		ele_password.sendKeys("Jaihanuman1234");
		
		//click on login button
		//Click on the login button
		WebElement ele_login=driver.findElement(By.xpath("//input[@id='Login']"));
		ele_login.click();
		
		
	
		//WebDriver driver = new ChromeDriver();
		
		
		
		System.out.println("Test case 6 is getting executed...");
		
		WebElement ele_myprofile=(WebElement) driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
	   //xpath of the myprofile	//a[contains(text(),'My Profile')]
		 ele_myprofile.click();
		
		//Edit personal information  //span[contains(text(),'Edit my personal information')]
		
		WebElement ele_editpersonal=(WebElement) driver.findElement(By.xpath("//a[contains(text(),'My Profile']"));
		((org.openqa.selenium.WebElement) ele_editpersonal).click();
		System.out.println("Test case6 is passed....");
		
		//Testcase-06 A
		//clickon contact button
		
		WebElement ele_contact=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']"));
		ele_contact.click();
		System.out.println("iframe for Edit profile is displayed");
		
		//Click on about tab
		////a[contains(text(),'About')]
		WebElement ele_about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		ele_about.click();
		System.out.println(" about tab is displayed...");
		
		//Click on lastname
		WebElement ele_lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		ele_lastname.sendKeys("pa");
		System.out.println("lastname is displayed");
		
		//click on saveall button
		WebElement ele_saveall=driver.findElement(By.xpath("/input[@class='zen-btn zen-primaryBtn zen-pas']"));
		ele_saveall.click();
		
		//click on post link
		WebElement ele_
		
		
		
		//click on share
		
		//click on file
		
		//choose file from computer
		
		//click on share
		
		
		
		
		
		
		
		
		
		
		
		
	}



}
