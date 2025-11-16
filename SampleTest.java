package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void openGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"));
        driver.quit();
    }
}
