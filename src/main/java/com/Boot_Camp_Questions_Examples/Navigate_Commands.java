package com.Boot_Camp_Questions_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Commands {
public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		//WebDriver Navigation commands
		driver.navigate().to("https://www.rediff.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}
}
