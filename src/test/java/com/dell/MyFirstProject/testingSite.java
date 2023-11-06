package com.dell.MyFirstProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;



public class testingSite {
@Test
public void openBrowser() throws Exception {
	
System.setProperty("Webdriver.edge.driver", "C:\\edge driver 116\\edgedriver_win64 (1)\\msedgedriver.exe");	
	
EdgeOptions nasrin = new EdgeOptions();
nasrin.addArguments("--remote-allow-origins=*");
	
WebDriver driver = new EdgeDriver();
driver.get("https://www.dell.com/");

driver.manage().window().maximize();

WebElement t = driver.findElement(By.id("mh-search-input"));
t.sendKeys("Accesories");

WebElement m = driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[1]/div[2]/div/button[2]"));
m.click();
Thread.sleep(10000);

driver.close();


}
	
	
	
	
	
}
