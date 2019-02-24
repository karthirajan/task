package ust.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-09\\git\\task\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		
		List<WebElement> title1 = driver.findElements(By.xpath("//div[@class='trainer-info'][3]/ul/li/ul/li[5]/ul/li"));
		for (WebElement x : title1) {
			System.out.println(x+"\n"+x.getText());
			
		}
		}
}
