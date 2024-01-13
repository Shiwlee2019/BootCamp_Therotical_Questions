package com.Boot_Camp_Questions_Examples;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementListExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
 
        driver.get("https://omayo.blogspot.com/");

        // Find all the web elements with a specific class name using XPath
        List<WebElement> options = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));

        // Iterate through the list and print the text of each element
        for (int i =0; i<options.size();i++) {
            System.out.println(options.get(i).getText());
        }

        // Close the browser
        driver.quit();
    }
}