package com.Boot_Camp_Questions_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookiesExample {
	public static void main(String[] args) {

		// Create a WebDriver instance (for example, Chrome)
		WebDriver driver = new ChromeDriver();

		// Open a webpage
		driver.get("https://tutorialsninja.com/demo");

		// Delete all cookies
		driver.manage().deleteAllCookies();

		// Close the WebDriver instance
		driver.quit();
	}
}
