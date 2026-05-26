package com.ecommerce.bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Click Home checkbox directly
        driver.findElement(By.cssSelector("span.rct-checkbox"))
              .click();

        Thread.sleep(5000);

        driver.quit();
    }
}
