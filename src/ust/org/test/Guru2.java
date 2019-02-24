package ust.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-09\\git\\task\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/");
		List<WebElement> title1 = driver.findElements(By.xpath("//div[@class='col-md-3'][4]/div/h4[1]//following-sibling::ul[1]"));
		for (WebElement x : title1) {
			System.out.println(x.getText());
			
		}
	
	
	}
}