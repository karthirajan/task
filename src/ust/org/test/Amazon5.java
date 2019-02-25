package ust.org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon5 {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\karthi1\\UST2\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones new",Keys.ENTER);
	   addPhone("5");
		  
	}
	  public static void addPhone(String one) {
		String locator="//li[@id='result_$']//a";
		locator=locator.replace("$", one);
		
		
		WebElement w = driver.findElement(By.xpath(locator));
		System.out.println(w.getText());
		WebDriverWait wait=new WebDriverWait(driver, 100);
		WebElement w1 = wait.until(ExpectedConditions.elementToBeClickable(w));
		Actions acc=new Actions(driver);
		acc.doubleClick(w1).perform();
		
		String name1 = driver.getWindowHandle();
		System.out.println(name1);
		Set<String> name2 = driver.getWindowHandles();
		List<String> li= new ArrayList<>(name2);
		for (String name3 : li) {
			System.out.println(name3);
			if (!name1.equals(name3)) {
				System.out.println("in");
				
			 driver.switchTo().window(li.get(2));
			 
			 System.out.println("success");
			 System.out.println(li.get(2));
			 driver.findElement(By.id("add-to-cart-button")).click();
			break;	
				
			}
			
		}
		

}
}
