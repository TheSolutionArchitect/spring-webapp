package com.awstechguide.automation;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	public HtmlUnitDriver driver;
	public String URL = "http://google.com";
	public String URL2 = "http://awstechguide.com";
	
	@Test
	public void test1() {
		   driver = new HtmlUnitDriver();
		   driver.navigate().to(URL2);
		   List<WebElement> el= driver.findElements(By.xpath("//*[text()[contains(.,'AWS Tech')]]"));
		   System.out.println("No of existance: "+el.size());
		   driver.findElements(By.partialLinkText("Tech"));
	   }
	
	@Test
	public void test2() {
		   driver = new HtmlUnitDriver();
		   driver.navigate().to(URL2);
		   List<WebElement> el= driver.findElements(By.xpath("//*[text()[contains(.,'AWS Tech')]]"));
		   System.out.println("No of existance: "+el.size());
		   driver.findElements(By.partialLinkText("Tech"));
	   }
}
