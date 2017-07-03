package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class flipkart_testTest {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");// launches the browser
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[8]/a")).click();// clicks login
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9789403377");//sends user id to textView
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("9789403377");//sends password to textView
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click();//clicks the login button
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("asus zenfone");// sends the key value "asus zenfone" to the flipkart search bar
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button")).click();// clicks the search button on the flipkart search bar
		
		String parentHandle = driver.getWindowHandle();
		 driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/div")).click();//clicks the asus zenfone max
		
		 for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
		Thread.sleep(6000);
		 driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[1]/div/div[1]/div/div/div[2]/ul/li[1]/button")).click();// clicks on the add to cart button
		 
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[1]/div[3]/div/div/a/button")).click();// clicks on the continue shopping button
		driver.findElement(By.className("LM6RPg")).sendKeys("Skullcandy earphones");// sends the key value to the search bar
		driver.findElement(By.className("vh79eN")).click();// clicks the search button 
		
		String subhandle = driver.getWindowHandle();
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/div")).click();//clicks the second element
		
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[1]/div/div[1]/div/div/div[2]/ul/li[1]/button")).click();//clicks add to kart
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[1]/div[3]/div/div/form/button")).click();// clicks the place order button
		String s = driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[3]/div[2]/div/div/div[1]/div[2]/div[3]/div/div[2]")).getText();// gets the total amount
		driver.findElement(By.xpath(".//*[@id='to-payment']/button")).click();//clicks the continue button
		Reporter.log("test is succesfull");
		Reporter.log("Final amt is "+s);
		System.out.println(s);
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
