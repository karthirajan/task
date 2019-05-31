package ust.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/home/ravin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		mainMenu("1");
		
		
		
	}
	public static void mainMenu(String name) {
		String locator="//div[@class='_3zdbog _3Ed3Ub']/ul//li[@class='Wbt_B2 _1YVU3_'][$]";
		locator=locator.replace("$", name);
		WebElement w = driver.findElement(By.xpath(locator));
		Actions acc=new Actions(driver);
		acc.moveToElement(w).perform();

	


	}
}
