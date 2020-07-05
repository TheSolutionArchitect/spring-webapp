package com.awstechguide.automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	private WebDriver driver;
	String URL = "https://www.amazon.ca";
	
	@BeforeClass
	public void testSetUp() {	
		System.setProperty("webdriver.chrome.driver","C:\\MyLocal\\AWSTechGuide\\workspace\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void verifyGooglePageTittle() {
		driver.navigate().to(URL);
		String getTitle = driver.getTitle();
		//Assert.assertEquals(getTitle, "Amazon");
		System.out.println("getTitle****"+getTitle);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("surface pro 7");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
