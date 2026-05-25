package com.ecommerce.bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open Amazon
        driver.get("https://www.amazon.in");

        // Maximize browser
        driver.manage().window().maximize();

        // Wait 3 seconds
        Thread.sleep(3000);

        // Find search box and type
        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("Mobile Phones");

        // Wait 2 seconds
        Thread.sleep(2000);

        // Press ENTER
        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys(Keys.ENTER);

        // Wait 5 seconds
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}
