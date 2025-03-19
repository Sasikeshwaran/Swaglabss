package org.AppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product extends Testing {
  
	public void productPage(WebDriver driver) {
		
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
	}
	
	
	public static void main(String[] arg) {
		Product a = new Product();
		a.appRUN();
		a.loginFields();
		a.productPage(driver);

	}
}
