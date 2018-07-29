package by.htp.test.waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.htp.test.driver.DriverSingletone;


public class TestWaitExample {
	
	private static WebDriver driver;
	
	
	@BeforeTest 
	public void initDriver () {
		driver = DriverSingletone.getDriver();
	}
	
	
	@Test
	public void smallTest() {
		
		driver.get("https://www.google.com");
		
		WebDriverWait waitSmth = new WebDriverWait (driver, 10);
		WebDriverWait waitSmthSecond = new WebDriverWait (driver, 10);
		
		//WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")));
		
		ExpectedCondition<Boolean> titleCondition =ExpectedConditions.titleContains("Java");
		ExpectedCondition<WebElement> elementPresence = ExpectedConditions.presenceOfElementLocated(By.name("q"));
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("DotNet");
		search.submit();
		
		waitSmth.until(titleCondition);
		
		String title = driver.getTitle();
		
		Assert.assertTrue(title.contains("Java"));
		
	}

}
