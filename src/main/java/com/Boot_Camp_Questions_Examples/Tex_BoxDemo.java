package com.Boot_Camp_Questions_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tex_BoxDemo {
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	// First way using sendKeys() WebDriver Command
	//driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	// Seconded way using JavascriptExecutor generally it uses when sendKeys don't work
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('input-email').setAttribute('value','seleniumpanda@gmail.com')");
 }
}
