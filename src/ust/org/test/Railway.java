package ust.org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Railway {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\karthi1\\UST2\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	    driver.get("https://enquiry.indianrail.gov.in/ntes/index.html");
	    driver.findElement(By.id("ui-id-3")).click();
	    driver.findElement(By.id("station1")).sendKeys("chennai ce");
	    Thread.sleep(5000);
	    WebElement W = driver.findElement(By.id("station2"));
	  W  .sendKeys("coimbatore n");
	 
	   dept("12.00", "11.00");
        
	
	}
	public static void dept(String dept,String arrt) throws Throwable {
		 Thread.sleep(5000);
		  List<WebElement> rows = driver.findElements(By.xpath("//td[@id='upperMostTD']/div//following-sibling::table/tbody/tr/td/div//div[3]//div[2]//table/tbody/tr"));
		  
		 
	        for (int i = 1; i < rows.size(); i++) {
	        	WebElement r = rows.get(i);
	        	List<WebElement> cols = r.findElements(By.tagName("td"));
	        	for (int j = 1; j < cols.size(); j++) {
	        		String name = cols.get(j).getText();
	        		
	        		if (name.equals(dept)) {
	        			System.out.println(cols.get(1));
						
					}else if(name.equals(arrt)) {
						System.out.println(cols.get(2));
						
					}
					
				}
				
			}
	        
		
		
		

	}
}