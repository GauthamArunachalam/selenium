package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CampusCommune {
	
	public static void main(String args[]) throws InterruptedException{
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		
		driver.findElement(By.className("gsfi")).sendKeys("Campus commune");
		driver.findElement(By.id("_fZl")).click();
		driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[5]/div[4]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='user_name']")).sendKeys("");
		driver.findElement(By.xpath(".//*[@id='user_password']")).sendKeys("");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div[1]/form/button")).click();
		
		String s= driver.findElement(By.xpath("html/body/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]")).getText();
		
		
		
		
		
		
	}

}
