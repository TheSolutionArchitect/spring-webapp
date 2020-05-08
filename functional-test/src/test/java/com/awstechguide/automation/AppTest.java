package com.awstechguide.automation;

import org.junit.Assert;
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
	String URL = "http://google.com";
	
	@BeforeClass
	public void testSetUp() {	
		System.setProperty("webdriver.chrome.driver","C:\\MyLocal\\AWSTechGuide\\workspace\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() {
		driver.navigate().to(URL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
		System.out.println("getTitle*********"+getTitle);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
