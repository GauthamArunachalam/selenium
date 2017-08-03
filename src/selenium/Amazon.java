package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Amazon {
	
	public static void main(String args[]) throws BiffException, FileNotFoundException, IOException{
		
		String path = "B:\\sel content\\amazon.xls";
		Workbook b = Workbook.getWorkbook(new FileInputStream(path));
		Sheet s = b.getSheet(0);
		
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://www.google.co.in");
		
		String search = s.getCell(0, 0).getContents();
		d.findElement(By.className("gsfi")).sendKeys(search);
		d.findElement(By.className("sbico-c")).click();
		//d.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
		
		String search1 = s.getCell(0,1).getContents();
		d.findElement(By.className("gsfi")).clear();
		d.findElement(By.className("gsfi")).sendKeys(search1);
		d.findElement(By.className("sbico-c")).click();
		
	}

}
