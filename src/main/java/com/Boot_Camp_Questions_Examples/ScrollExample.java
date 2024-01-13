package com.Boot_Camp_Questions_Examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {
	public static void main(String[] args) {
		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the desired webpage
		driver.get("https://tutorialsninja.com/demo");

		// Create an instance of JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		// Wait for a while (you may need to add proper waits in your actual code)
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Scroll up the page
		js.executeScript("window.scrollTo(0, 0);");

		// Close the WebDriver
		driver.quit();
	}
}
