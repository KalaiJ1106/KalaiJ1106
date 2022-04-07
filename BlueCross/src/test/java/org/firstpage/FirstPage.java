package org.firstpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluecrossnc.com/");
		
		driver.switchTo().frame(1);
		WebElement element = driver.findElement(By.xpath("//img[@src='https://www.bluecrossnc.com/profiles/bcbs/themes/bcbsnc/logo.png']"));
		 boolean b = element.isDisplayed();
		System.out.println(b);
		
		driver.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Register Now']")).click();
		
	}
}
