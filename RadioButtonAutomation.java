package com.ecommerce.bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://demoqa.com/radio-button");

        // Maximize browser
        driver.manage().window().maximize();

        // Wait
        Thread.sleep(3000);

        // Click Yes radio button
        driver.findElement(By.xpath("//label[@for='yesRadio']"))
              .click();

        // Wait
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}
