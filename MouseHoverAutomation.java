package com.ecommerce.bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.amazon.in");

        // Maximize browser
        driver.manage().window().maximize();

        // Wait
        Thread.sleep(3000);

        // Find account menu
        WebElement accountMenu = driver.findElement(
                By.id("nav-link-accountList"));

        // Create Actions object
        Actions action = new Actions(driver);

        // Perform mouse hover
        action.moveToElement(accountMenu).perform();

        System.out.println("Mouse hover successful");

        // Wait
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}
