package ust.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Life {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-09\\git\\task\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		List<WebElement> title1 = driver.findElements(By.xpath("//a[@class='dropdown-item header-dropdown-back']//parent::li[1]//parent::ul[1]"));
		for (WebElement x : title1) {
			System.out.println(x+"\n"+x.getText());
			
		}
		List<WebElement> title2 = driver.findElements(By.xpath("//ul[@id='primaryNav']/li[1]/div[2]/ul/li[1]//following-sibling::li/a[1]"));
		for (WebElement x : title2) {
			System.out.println(x+"\n"+x.getText());
			
		
	}
	List<WebElement> title3= driver.findElements(By.xpath("//ul[@id='primaryNav']/li[1]/div[2]/ul/li[1]//following-sibling::li/a[contains(text(),'')]"));
	for (WebElement x : title3) {
		System.out.println(x+"\n"+x.getText());
		
	}
	
}
}