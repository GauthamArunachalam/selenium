package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestingExcel {
	
	public static void main(String args[]) throws  IOException, BiffException, InterruptedException{
		
		String path = "B:\\selcontent\\excel\\test.xls";
		FileInputStream f = new FileInputStream(path);
		Workbook b = Workbook.getWorkbook(f);
		
		Sheet s = b.getSheet(0);

	
		 WebDriver d = new FirefoxDriver();
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 d.get("https://www.google.co.in");
		 Thread.sleep(5000);
		 String text = s.getCell(0, 0).getContents();
		 
		// Alert alert = d.switchTo().alert();
		 //alert.dismiss();
		
		 d.findElement(By.className("gsfi")).sendKeys(text);
		 d.findElement(By.xpath(".//*[@id='_fZl']")).click();
		 
		 d.findElement(By.cssSelector(".r>a")).click();
		 d.findElement(By.xpath("html/body/div[2]/div[1]/div/div[5]/div[4]/a")).click();
		 
		 Cell cell = s.getCell(1, 0);
		 String userid = cell.getContents();
		
		 d.findElement(By.id("user_name")).sendKeys(userid);
		 String pass = s.getCell(2, 0).getContents();
		 d.findElement(By.id("user_password")).sendKeys(pass);
		 
		 
		
		
	}

}
