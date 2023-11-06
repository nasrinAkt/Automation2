package com.dell.MyFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class class1 {

	@Test
	
	public void lucky() throws Exception {
		
	System.setProperty("webdriver.firefox.driver", "C:\\Firefox driver\\geckodriver.exe");	
		
	FirefoxOptions happy = new FirefoxOptions();
	happy.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.walmart.com/");
	
	driver.manage().window().maximize();
	
	WebElement h = driver.findElement(By.name("q"));
	h.sendKeys("beauty products");
	WebElement m = driver.findElement(By.cssSelector(".ld-Search"));
	m.click();
	
    Thread.sleep(10000);
	
	driver.close();
	
	}
	
	
	
}
