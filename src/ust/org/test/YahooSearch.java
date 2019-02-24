package ust.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearch {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\karthi1\\UST2\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://in.yahoo.com/?p=us");
	    driver.findElement(By.id("uh-search-box")).sendKeys("selenium",Keys.ENTER);
	    goToPage("3");
	}

	public static void goToPage(String name) {
		List<WebElement> x = driver.findElements(By.xpath("//div[@class='compPagination']/strong//following::a"));
	for (int i = 0; i < x.size(); i++) {
		 WebElement w = x.get(i);
			String name1	=	w.getText();
			
			if (name1.equals(name)) {
				 WebElement w1 = w.findElement(By.xpath("//div[@class='compPagination']/a"));
				 
				 w1.click();
					break;
			}
		
				
			
	}		
	}			
				
				
	}

