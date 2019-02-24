package ust.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Netflix {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\karthi1\\UST2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://media.netflix.com/en/");
		driver.findElement(By.xpath("//div[@class='nav-center'][1]/ul/li[2]/a")).click();
		driver.findElement(By.id("user_email")).sendKeys("kk@gmail.com",Keys.ENTER);
		WebDriverWait x=new WebDriverWait(driver, 20);
		WebElement w1 = driver.findElement(By.xpath("//div[@class='ping-messages']/div"));
		x.until(ExpectedConditions.elementToBeClickable(w1));
		String name = driver.findElement(By.xpath("//div[@class='ping-messages']/div")).getText();
		System.out.println(name);


	}
}