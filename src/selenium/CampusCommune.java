package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.io.IOException;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;


public class CampusCommune {
	
	public static void main(String args[]) throws InterruptedException, IOException, AWTException{
		
		ScreenRecorder screen ;
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		GraphicsConfiguration cs = GraphicsEnvironment
		         .getLocalGraphicsEnvironment()
		         .getDefaultScreenDevice()
		         .getDefaultConfiguration();
		
		screen = new ScreenRecorder(cs, new Format(MediaTypeKey, MediaType.VIDEO, MimeTypeKey, MIME_AVI), new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, (int)24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f, KeyFrameIntervalKey, (int)(15*60)), new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)), null);
				
		screen.start();
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		
		driver.findElement(By.className("gsfi")).sendKeys("Campus commune");
		driver.findElement(By.id("_fZl")).click();
		driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[5]/div[4]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='user_name']")).sendKeys("gauthamarunachalam1998@gmail.com");
		driver.findElement(By.xpath(".//*[@id='user_password']")).sendKeys("Gautham@1998");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div[1]/form/button")).click();
		
		//String s= driver.findElement(By.xpath("html/body/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]")).getText();
		
		
		screen.stop();
		System.out.println("check");
		
		
		
	}

}
