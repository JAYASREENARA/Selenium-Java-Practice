package com.ecommerce.bigbasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://demoqa.com/select-menu");

        // Maximize browser
        driver.manage().window().maximize();

        // Wait
        Thread.sleep(3000);

        // Find dropdown
        Select dropdown = new Select(
                driver.findElement(By.id("oldSelectMenu")));

        // Select option
        dropdown.selectByVisibleText("Purple");

        // Wait
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}
