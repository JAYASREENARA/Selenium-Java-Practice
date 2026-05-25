package com.ecommerce.bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open login website
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Maximize browser
        driver.manage().window().maximize();

        // Enter username
        driver.findElement(By.id("username"))
              .sendKeys("student");

        // Enter password
        driver.findElement(By.id("password"))
              .sendKeys("Password123");

        // Click login button
        driver.findElement(By.id("submit"))
              .click();

        // Wait 5 seconds
        Thread.sleep(5000);

        // Verify login success
        String currentUrl = driver.getCurrentUrl();

        // Print URL in console
        System.out.println(currentUrl);

        // Close browser
        driver.quit();
    }
}
