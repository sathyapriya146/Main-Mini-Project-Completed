package com.selenium.mini.project2;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
public class Sele_Mini_Project2 {
public static void main(String[] args) throws AWTException, IOException {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\sathyapriya\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("sathyapriya123");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement passWord = driver.findElement(By.id("password"));
	passWord.sendKeys("Msvalan200116*");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement logIn = driver.findElement(By.id("login"));
	logIn.click();
	
	WebElement location = driver.findElement(By.id("location"));
	location.click();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement select_Hotel = driver.findElement(By.id("hotels"));
	select_Hotel.click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement select_Room = driver.findElement(By.xpath("//select[@id='room_type']"));
	select_Room.click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement no_Of_Rooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
	Select s = new Select(no_Of_Rooms);
	s.selectByValue("2");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement check_In_Date = driver.findElement(By.xpath("//input[@value='22/11/2021']"));
	check_In_Date.sendKeys("25/11/2021");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement check_Out_Date = driver.findElement(By.xpath("//input[@value='23/11/2021']"));
	check_Out_Date.sendKeys("27/11/2021");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement adults_Per_Room = driver.findElement(By.xpath("//select[@id='adult_room']"));
	Select s1 = new Select(adults_Per_Room);
	s1.selectByIndex(1);
	
	WebElement children_Per_Room = driver.findElement(By.xpath("//select[@id='child_room']"));
	Select s2 = new Select(children_Per_Room);
	s2.selectByValue("3");
	
	WebElement search = driver.findElement(By.id("Submit"));
	search.click();
	
	WebElement select = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
	select.click();
	
	WebElement cont = driver.findElement(By.id("continue"));
	cont.click();
	
	WebElement first_Name = driver.findElement(By.xpath("//input[@name='first_name']"));
	first_Name.sendKeys("sathya");
	
	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("T");
	
	driver.findElement(By.id("address")).sendKeys("T.nagar,Chennai-28");
	
	WebElement cc_Num = driver.findElement(By.xpath("//input[@name='cc_num']"));
	cc_Num.sendKeys("9673826583519473");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement card_Type = driver.findElement(By.xpath("//select[@name='cc_type']"));
	Select s3 = new Select(card_Type);
	s3.selectByValue("VISA");
	
	WebElement cc_Month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select s4 = new Select(cc_Month);
	s4.selectByValue("6");
	
	WebElement ex_Year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	Select s5 = new Select(ex_Year);
	s5.selectByValue("2022");
	WebElement cvv_No = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	cvv_No.sendKeys("1200");
	
	WebElement book_Now = driver.findElement(By.xpath("//input[@name='book_now']"));
	book_Now.click();
	
	WebElement logOut = driver.findElement(By.id("logout"));
	logOut.click();
	
	
//	TakesScreenshot ts = (TakesScreenshot)driver;
//	File source = ts.getScreenshotAs(OutputType.FILE);
//	File destination = new File("D:\\sathyapriya\\Selenium\\screenshot//mini2.png");
//	FileUtils.copyFile(source, destination);
}
}
