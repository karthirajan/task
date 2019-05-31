package ust.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bobcat {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Greens-09\\\\git\\\\task\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bobcat.com/in/en/index");
		driver.findElement(By.xpath("//img[@alt='Compact Excavators']")).click();
		List<WebElement> title = driver.findElements(By.xpath("//img[@alt='Bobcat E27 Compact Excavator'][1]//following::div[1]"));
		for (WebElement x : title) {
			System.out.println(x+"\n"+x.getText());
			
		}
		
		getdata("");
		
		
}
	
	private static void getdata(String name) {
		// TODO Auto-generated method stub

	}
}
