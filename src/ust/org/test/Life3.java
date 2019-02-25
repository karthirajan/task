package ust.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Life3 {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\karthi1\\UST2\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.lifetime.life/");
	    mainMenu("2");
	    subMenu("2");
	 
	}
	public static void mainMenu(String name) {
		String locator="//nav[@aria-label='Primary Navigation']/ul/li[$]";
		locator=locator.replace("$", name);
		driver.findElement(By.xpath(locator)).click();
		
		
	}
	public static void subMenu(String name) {
		String locator="//li[@class='nav-item  dropdown open']//div[2]/ul//li[$]";
		locator=locator.replace("$", name);
		driver.findElement(By.xpath(locator)).click();

	}
}