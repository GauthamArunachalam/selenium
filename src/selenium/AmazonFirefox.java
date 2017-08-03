package selenium;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class AmazonFirefox {
  @Test
  public void f() throws  FileNotFoundException, IOException, BiffException, RowsExceededException, WriteException {
	  
	  Workbook w = Workbook.getWorkbook(new FileInputStream("B:\\selcontent\\excel\\amaz.xls"));
	  Sheet s = w.getSheet(0);
	  
	  
	  WebDriver d = new FirefoxDriver();
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  d.get("https://www.google.co.in");
	  
	  Cell c = s.getCell(0, 0);
	  String text = c.getContents();
	  Reporter.log("* sends key value to google search bar");
	  d.findElement(By.className("gsfi")).sendKeys(text);
	  Reporter.log("* Successfully sent the key values");
	  
	  Reporter.log("* clicks the google search button");
	  d.findElement(By.xpath(".//*[@id='_fZl']")).click();
	  Reporter.log("* Successfully clicks the search button");
	  
	  Reporter.log("* clicks the amazon webpage");
	  d.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
	  Reporter.log("* successfully clicks the amazon webpage");
	  
	  String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
	  File img = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(img, new File("B:\\selcontent\\screenshot\\"+ timestamp +".png"));
	  Reporter.log("* takes a screenshot of the webpage");
	  
	  String assr = d.findElement(By.xpath(".//*[@id='nav-your-amazon']")).getText();
	  if(assr.contains("mazon")){
		  Reporter.log("* assert is successfull");
	  }
	  
	  c = s.getCell(1, 0);
	  text = c.getContents();
	  Reporter.log("* sends the key value into the amazon search bar"); 
	  d.findElement(By.id("twotabsearchtextbox")).sendKeys(text);
	  Reporter.log("* successfully sends the key value");
	  
	  Reporter.log("* clicks the search button of amazon");
	  d.findElement(By.className("nav-input")).click();
	  Reporter.log("* successfully clicks the search button");
	  
	  Reporter.log("* clicks the link product");
	  d.findElement(By.xpath(".//*[@id='result_0']/div/div[3]/div[1]/a/h2")).click();
	  
	  for(String winHandle: d.getWindowHandles()){
		  d.switchTo().window(winHandle);
	  }
	  
	  Reporter.log("* successfully switched between the window");
	  
	  String timestamp1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
	  File img1 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(img1, new File("B:\\selcontent\\screenshot\\"+ timestamp +".png"));
	  Reporter.log("* takes a screenshot of the webpage");
	  
	  Reporter.log("* Takes the titel of the product");
	  String as = d.findElement(By.id("productTitle")).getText();
	  String as1 = d.findElement(By.id("priceblock_ourprice")).getText();
	  if(as.contains("OnePlus 5")){
		  Reporter.log("* successfull");
		  
		  File f = new File("B:\\selcontent\\excel\\amazBook.xls");
		  WritableWorkbook wb = Workbook.createWorkbook(f);
		  WritableSheet ws = wb.createSheet("sheet1", 0);
		  
		  Label l = new Label(0,0,as);
		  Label l2 = new Label(1,0,as1);
		  Label l3 = new Label(2,0,"pass");
		  
		  ws.addCell(l);
		  ws.addCell(l2);
		  ws.addCell(l3);
		  
		  wb.write();
		  wb.close();
	  }
	 
	  
	  
	  Reporter.log("* clicks the buy now button");
	  d.findElement(By.id("buy-now-button")).click();
	  Reporter.log("* successfully clicks the buy now button");
	  
	  Reporter.log("* sends the user id to the login page");
	  c = s.getCell(2, 0);
	  text = c.getContents();
	  d.findElement(By.id("ap_email")).sendKeys(text);
	  Reporter.log("* successfully send the key values");
	  
	  Reporter.log("* send the password");
	  c = s.getCell(3, 0);
	  text = c.getContents();
	  //System.out.println(text);
	  d.findElement(By.id("ap_password")).sendKeys(text);
	  d.findElement(By.id("ap_password")).sendKeys(Keys.ENTER);
	  Reporter.log("* successfully sends the password");
	  
	  
	  Reporter.log("* successfully log in");
		  
	  
	  
  
  
  }
}
