package org.example;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setUp(){
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