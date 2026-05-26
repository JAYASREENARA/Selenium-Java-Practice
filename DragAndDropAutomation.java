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
        driver.get("https://demoqa.com/droppable");

        // Maximize browser
        driver.manage().window().maximize();

        // Wait
        Thread.sleep(3000);

        // Source element
        WebElement drag = driver.findElement(By.id("draggable"));

        // Target element
        WebElement drop = driver.findElement(By.id("droppable"));

        // Actions class
        Actions action = new Actions(driver);

        // Perform drag and drop
        action.dragAndDrop(drag, drop).perform();

        System.out.println("Drag and Drop successful");

        // Wait
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}
