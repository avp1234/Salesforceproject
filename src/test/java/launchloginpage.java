import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.*;

public class launchloginpage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = null;
		WebDriverManager.chromiumdriver().setup();
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\anasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		//Get the url of the page
		
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		
		//System.out.println(" navigate to the next page...");
		
		//Go to the next page
		//driver.findElement(By.className("w1I7fb")).click();
				
				
	
		// Enter the text for the email.
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("anasuya.veluri@gmail.com");
		System.out.println(" user name is given.....");
		
		
		//click on the next button 
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		//Enter the password for the email.
		WebElement passw = driver.findElement(By.name("//input[@name='password']"));
		passw.sendKeys("anasuya12345");
		System.out.println(" password is given.....");
		
		//Enter the next button for the moving to the email page
		WebElement next1 = driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']"));
		next1.click();
		
		
}

}
