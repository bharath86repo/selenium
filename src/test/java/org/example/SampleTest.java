package org.example;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
	WebDriver driver = null;
    

    @BeforeClass
    public void setUp(){
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://google.com/");
    }

    @Test
    public void test(){
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("google"));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}