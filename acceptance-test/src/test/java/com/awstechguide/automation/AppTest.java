package com.awstechguide.automation;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	public HtmlUnitDriver driver;
	//public WebDriver driver;
	public WebDriverWait wait;
	public String URL = "http://google.com";
	public String URL2 = "http://awstechguide.com";
	
	@Test(priority = 0)
    public void testUrl()  {
		driver = new HtmlUnitDriver();
		//driver= new FirefoxDriver();
		wait = new WebDriverWait(driver, 5);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Som Speaks");;
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();;
		System.out.println("getTitle*********"+getTitle);
		driver.quit();
    }
	
	@Test(priority = 1)
    public void testUrl2()  {
		driver = new HtmlUnitDriver();
		wait = new WebDriverWait(driver, 5);
		driver.get(URL2);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "AWS Tech Guide");
		System.out.println("getTitle*********"+getTitle);
		driver.quit();
	}
}
