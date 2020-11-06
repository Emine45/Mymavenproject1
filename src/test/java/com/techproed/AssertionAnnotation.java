package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertionAnnotation {

    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //putting implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Maximizing window
        driver.manage().window().maximize();
    }

    @Test
    public void titleTest(){

        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Test
    public void imageTest(){

        WebElement imageElement= driver.findElement(By.id("hplogo"));
        Assert.assertTrue(imageElement.isDisplayed());

    }
    @Test
    public void linkTest(){

        WebElement linkElement = driver.findElement(By.linkText("Gmail"));
        Assert.assertTrue(linkElement.isDisplayed());

    }
    @After
    public void tearDown() {
        //I am closing the driver after each test case
        driver.close();
    }

}
