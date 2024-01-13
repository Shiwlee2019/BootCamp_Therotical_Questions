package com.Boot_Camp_Questions_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");

		// Find the element on which you want to perform the double click

		WebElement doubleClickLink = driver.findElement(By.id("testdoubleclick"));

		// Create an Actions object
		Actions actions = new Actions(driver);

		// Perform the double click action on the element
		actions.doubleClick(doubleClickLink).perform();

		// Close the browser
		driver.quit();
	}
}
