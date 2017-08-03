package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Snapdeal {
	
	public static void main(String args[]){
		
		WebDriver d = new FirefoxDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://www.snapdeal.com/");
		
		//d.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div")).click();// clicks the login button
		//d.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a")).click();//clicks the login button
		//d.findElement(By.xpath(".//*[@id='userName']")).sendKeys("9789403377");// sends the login user credentials to the text box
		//d.findElement(By.xpath(".//*[@id='checkUser']")).click();// clicks the continue button
		//d.findElement(By.xpath(".//*[@id='j_password_login_uc']")).sendKeys("Gautham@1998");// sends the password to password textbox
		//d.findElement(By.xpath(".//*[@id='submitLoginUC']")).click();// clicks the login button
		
		d.findElement(By.xpath(".//*[@id='inputValEnter']")).sendKeys("G-Shock watches");//send the key value to the search bar in snapdeal
		d.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[2]/button")).click();// clicks the search button in the snapdeal home page
		d.findElement(By.id("764971219")).click();// clicks the item
		for(String han : d.getWindowHandles()){
			d.switchTo().window(han);
		}
		
		d.findElement(By.id("add-cart-button-id")).click();//it clicks the add to cart button
		//d.findElement(By.xpath(".//*[@id='cartProductContainer']/div/div[2]/div[2]/div/div[2]/div")).click();// clicks the view cart button 
		d.findElement(By.xpath(".//*[@id='inputValEnter']")).sendKeys("cricket bat");//gives the input to the search bar
		d.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[2]/button")).click();//clicks the search button in the search bar
		d.findElement(By.xpath(".//*[@id='content_wrapper']/div[7]/div[4]/div/div[1]/div[2]/div[2]/div[3]/button")).click();//clicks the view more options button in snapdeal
		d.findElement(By.xpath(".//*[@id='tab-']/div/div/div[1]/span/a[20]")).click();//clicks the 'R' letter in the list
		d.findElement(By.xpath(".//*[@id='tab-']/div/div/div[2]/div/div/div[21]/div[2]/label")).click();//clicks the button
		d.findElement(By.xpath(".//*[@id='content_wrapper']/div[5]/div/div[1]/div/div")).click();// clicks the apply button 
		d.findElement(By.id("636398741149")).click();//clicks the item licked
		
		
		
		
	}

}
