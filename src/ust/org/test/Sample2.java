package ust.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\karthi1\\UST2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		List<WebElement> title1 = driver.findElements(By.xpath("//div[@class='trainer-info'][3]/ul/li/ul/li[5]/ul/li"));
		for (WebElement x : title1) {
			System.out.println(x+"\n"+x.getText());
			
		}
		}
}
