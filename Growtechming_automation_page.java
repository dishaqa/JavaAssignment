package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growtechming_automation_page {
	
	public static void main(String[] args) 
	{
	
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://grotechminds.com/registeration-form/");
			driver.manage().window().maximize();
			
			WebElement fn = driver.findElement(By.name("firstName"));
			fn.sendKeys("Disha");
			
			WebElement ln = driver.findElement(By.name("lastName"));
			ln.sendKeys("chauhan");
			
			WebElement email1 = driver.findElement(By.name("email"));
			email1.sendKeys("disha@gmail.com");
			
			
		
	}

}
