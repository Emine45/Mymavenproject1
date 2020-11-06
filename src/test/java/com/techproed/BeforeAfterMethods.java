package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BeforeAfterMethods {
//    Create a class: BeforeAfterMethods 
//    Then create 3 different test methods using the following names. And go to google
//    titleTest =>Verify if google title = “Google” 
//    imageTest => Verify if google image displays or not 
//    gmailLinkTest => Verify if the Gmail link is displayed or not
//    Close the browser after each test

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
        if (expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual : "+actualTitle);
            System.out.println("Expected : "+expectedTitle);
        }

    }
    @Test
    public void imageTest(){

        WebElement imageElement= driver.findElement(By.id("hplogo"));
        if (imageElement.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAILS");
        }

    }
    @Test
    public void linkTest(){

        WebElement linkElement = driver.findElement(By.linkText("Gmail"));
        if (linkElement.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
    @After
    public void tearDown() {
        //I am closing the driver after each test case
        driver.close();
    }
}
