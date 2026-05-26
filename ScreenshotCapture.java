package com.ecommerce.bigbasket;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.google.com");

        // Maximize browser
        driver.manage().window().maximize();

        // Wait
        Thread.sleep(3000);

        // Take screenshot
        File src = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        // Destination file
        File dest = new File("C:\\Users\\Public\\google.png");

        // Copy screenshot
        Files.copy(src.toPath(), dest.toPath());

        System.out.println("Screenshot taken successfully");

        // Wait
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}
