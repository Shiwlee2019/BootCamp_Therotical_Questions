package com.Boot_Camp_Questions_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {

		// 1. What is Radio button & Checkbox on Web Page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// 3. Identify Radio button with CSS
		// htmltag[property='value of that property']
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']")).click();
		WebElement gender = driver.findElement(By.cssSelector("input[value='2']"));
		// 4.Click on Radio Button
		gender.click();
		// 5.Check Radio button is Clicked or Not
		System.out.println("Radio selection is " + gender.isSelected());
	}
}
