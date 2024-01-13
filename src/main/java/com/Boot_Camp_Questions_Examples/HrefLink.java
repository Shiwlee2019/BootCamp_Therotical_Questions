package com.Boot_Camp_Questions_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HrefLink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		WebElement link = driver.findElement(By.linkText("My Account"));
		String url =link.getAttribute("href");
		System.out.println(url);
		// Close the browser
		driver.quit();
	}
}
