package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class flipkartTest {
  @Test
  public void f() throws InterruptedException, IOException {
	  
	  WebDriver driver;
		driver = new FirefoxDriver();
		System.out.println("driver opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		System.out.println("searched");
		Thread.sleep(15000);
		//driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("flipkart");//google search
		//driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
		//driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/h3/a")).click();//fipkart click
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();//login click
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9789403377");//login no.
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("9789403377");//login password
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click();//login button click
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("ipod");//flipkart search box
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button")).click();//flipkart search button
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button")).click();//sort high to low
		driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/div[2]/div[3]/div[1]/div[3]/div/a[2]")).click();//product click
		String price = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[3]/div/div/div[1]")).getText();
		if(price.equals("₹31,899"))
		{
			System.out.println("choosen product is right");
		}
		File img1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img1, new File("B:\\flipkartselenium\\screenshot1.png"));
		driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div/div/div[2]/div/ul/li[2]/form/button")).click();//buy now click
		driver.findElement(By.xpath(".//*[@id='order_summary_panel']/div[2]/div[3]/form/div[2]/div/div[1]/a")).click();//continue click
		
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
