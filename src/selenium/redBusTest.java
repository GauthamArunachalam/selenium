package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class redBusTest {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in");// loads the redbus webpage
		
		driver.findElement(By.id("src")).sendKeys("Pondicherry");// sends the key "pondicherry" to from textBox
		driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");// sends the key "banglore" to to textbox
		driver.findElement(By.xpath(".//*[@id='search']/div/div[2]/div/ul/li[1]")).click();
		driver.findElement(By.id("onward_cal")).click();// clicks the onward calender
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[1]")).click();//clicks the date 4 
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(".//*[@id='search_btn']"));// clicks the search button
		ele.click();
		driver.findElement(By.xpath(".//*[@id='sortViewonward']/div/ul/li[1]/a")).click();//clicks the sort by fare button
		String name = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[3]/div[1]")).getText();// gets the name of the bus
		String type = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[3]/div[2]")).getText();// gets the type of the  bus
		String starttime = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[4]/div[1]/div[1]")).getText();//gets the start time
		String endtime = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[4]/div[1]/div[3]")).getText();//gets the end time
		String seats = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[6]/div[1]/div")).getText();//gets the number of seats
		String price = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[7]/div[1]/div")).getText();//gets the amount
		driver.findElement(By.xpath(".//*[@id='sortViewonward']/div/ul/li[1]/a")).click();//clicks the fare button again
		String name2 = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[3]/div[1]")).getText();//gets the name
		String type2 = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[3]/div[2]")).getText();//gets the type of the bus
		String starttime2 = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[4]/div[1]/div[1]")).getText();//gets the staring time
		String endtime2 = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[4]/div[1]/div[3]")).getText();//gets the end time
		String seats2 = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[6]/div[1]/div")).getText();//gets the number of seats
		String price2 = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[7]/div[1]/div[1]")).getText();//gets the cost
		
		Reporter.log("Bus1");
		Reporter.log(name);
		Reporter.log(type);
		Reporter.log(starttime);
		Reporter.log(endtime);
		Reporter.log(seats);
		Reporter.log(price);
		
		
		Reporter.log("Bus2");
		Reporter.log(name2);
		Reporter.log(type2);
		Reporter.log(starttime2);
		Reporter.log(endtime2);
		Reporter.log(seats2);
		Reporter.log(price2);
		
		
		//driver.quit();
		
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
