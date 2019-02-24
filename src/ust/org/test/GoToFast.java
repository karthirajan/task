package ust.org.test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoToFast {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\karthi1\\UST2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fast.com/");
		WebDriverWait x=new WebDriverWait(driver, 20);
		WebElement w1 = driver.findElement(By.xpath("//div[@id='your-speed-message']"));
		x.until(ExpectedConditions.elementToBeClickable(w1));
		String name = w1.getText();
		if(name.equals("Your Internet speed is")) {
			System.out.println("entered");
		WebElement w = driver.findElement(By.xpath("//div[@class='speed-controls-container centered']"));
    
      System.out.println(w.getText());
	
		}
	
	}
}