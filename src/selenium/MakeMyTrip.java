package selenium;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {
	
	public static void main(String args[]) throws IOException{
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		d.get("https://www.makemytrip.com");
		
		d.findElement(By.id("hp-widget__sfrom")).clear();
		d.findElement(By.id("hp-widget__sfrom")).sendKeys("Chennai");
		d.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);
		d.findElement(By.id("hp-widget__sTo")).sendKeys("Mumbai");
		d.findElement(By.id("hp-widget__sTo")).sendKeys(Keys.ENTER);
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
		File img = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img,new File("B:\\screenshot\\"+ timeStamp +".png"));
		
		 d.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
		 WebElement el = d.findElement(By.xpath(".//*[@id='dp1499875919895']/div/div[1]/table/tbody/tr[5]/td[4]"));
		el.click();
		
		d.findElement(By.xpath(".//*[@id='dp1499868544578']/div/div[1]/table/tbody/tr[5]/td[4]")).click();
		
	}

}
