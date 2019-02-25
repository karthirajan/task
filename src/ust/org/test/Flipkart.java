package ust.org.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\karthi1\\UST2\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	   WebElement w1 = driver.findElement(By.xpath("//ul[@class='_114Zhd']/li[1]"));
	   Actions acc=new Actions(driver);
	   acc.moveToElement(w1).perform();
	driver.findElement(By.xpath("//ul[@class='_2OZ78M _1fj2FQ'][1]/li/ul/li[4]")).click();


	}
	
	

}


