package com.ecommerce.bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://demoqa.com/alerts");

        // Maximize browser
        driver.manage().window().maximize();

        // Wait
        Thread.sleep(3000);

        // Click alert button
        driver.findElement(By.id("alertButton"))
              .click();

        // Wait
        Thread.sleep(2000);

        // Handle alert
        driver.switchTo().alert().accept();

        System.out.println("Alert handled successfully");

        // Wait
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}
