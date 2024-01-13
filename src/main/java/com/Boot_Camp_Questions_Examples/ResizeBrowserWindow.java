package com.Boot_Camp_Questions_Examples;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeBrowserWindow {
	public static void main(String[] args) {
       
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo");

        Dimension dimension = new Dimension(800, 600);
        driver.manage().window().setSize(dimension);

        // Close the browser
        driver.quit();
    }
}

