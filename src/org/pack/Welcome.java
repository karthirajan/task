package org.pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.insta.boom;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Welcome {

		public void fb() throws AWTException, InterruptedException, IOException {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Ashstarr\\eclipse-workspace\\May\\driver\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			Actions a = new Actions(driver);
			Robot r = new Robot();
			Thread.sleep(3000);
			driver.get("https://www.snapdeal.com/");
			WebElement not = driver.findElement(By.xpath("//button[text()='NOT NOW']"));
			a.click(not).perform();
			WebElement elecTronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
			a.moveToElement(elecTronics).perform();
			WebElement tv = driver.findElement(By.xpath("//span[text()='Top Selling TVs']"));
			a.click(tv).perform();

			WebElement search = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
			a.sendKeys(search, "600041").perform();
			a.doubleClick(search).perform();
			a.contextClick(search).perform();
			for (int i = 0; i < 2; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			WebElement klik = driver.findElement(By.xpath("//section[@class='js-section clearfix dp-widget  dp-fired']"));
			a.click(klik).perform();
			WebElement pincode = driver.findElement(By.xpath("(//input[@class='sd-input'])[2]"));
			a.click(pincode).perform();
			a.contextClick(pincode).perform();
			for (int i = 0; i < 3; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);


			TakesScreenshot tk = (TakesScreenshot)driver;
			File copy = tk.getScreenshotAs(OutputType.FILE);
			File paste = new File("C:\\Users\\Ashstarr\\eclipse-workspace\\May\\Boom.png");
			FileUtils.copyFile(copy, paste);

			}

			public static void main(String[] args) throws AWTException, InterruptedException, IOException {
				dummy b = new dummy();
				b.fb();
			}
			}
