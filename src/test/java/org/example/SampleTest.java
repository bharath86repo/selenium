package org.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
	WebDriver driver = null;
    

    @BeforeClass
    public void setUp() throws MalformedURLException{
    	//ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        //driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        driver= new HtmlUnitDriver();
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