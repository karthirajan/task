package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloAll {
	public void launch() {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Project\\task\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		
		 WebElement usernameTxt = driver.findElement(By.id("email"));
		 usernameTxt.sendKeys("jaiganesh");
		 WebElement pswrdTxt = driver.findElement(By.name("pass"));
		 pswrdTxt.sendKeys("123456789");
		 driver.close();
		 }

	public static void main(String[] args) {
		HelloAll b = new HelloAll();
		b.launch();
	} 

	
	

}
