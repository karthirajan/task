package ust.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\karthi1\\UST2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bobcat.com/in/en/index");
		driver.findElement(By.xpath("//img[@alt='Compact Excavators']")).click();
		List<WebElement> title = driver.findElements(By.xpath("//img[@alt='Bobcat E27 Compact Excavator'][1]//following::div[1]"));
		for (WebElement x : title) {
			System.out.println(x+"\n"+x.getText());
			
		}
}
}
