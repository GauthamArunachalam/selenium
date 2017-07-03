package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redBus {
	
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in");// loads the redbus webpage
		
		driver.findElement(By.id("src")).sendKeys("Pondicherry");// sends the key "pondicherry" to from textBox
		driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");// sends the key "banglore" to to textbox
		driver.findElement(By.xpath(".//*[@id='search']/div/div[2]/div/ul/li[1]")).click();
		driver.findElement(By.id("onward_cal")).click();// clicks the onward calender
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[4]/td[2]")).click();//clicks the date 4 
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
		
		System.out.println("Bus1");
		System.out.println(name);
		System.out.println(type);
		System.out.println(starttime);
		System.out.println(endtime);
		System.out.println(seats);
		System.out.println(price);
		
		System.out.println("Bus 2");
		System.out.println(name2);
		System.out.println(type2);
		System.out.println(starttime2);
		System.out.println(endtime2);
		System.out.println(seats2);
		System.out.println(price2);
		
	}

}
