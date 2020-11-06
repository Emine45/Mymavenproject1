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

public class RadioButton {
//    Create a class : RadioButton 
//    Go to https://www.facebook.com/ 
//    Locate the elements of radio buttons 
//    Then click on the radio buttons for your gender if they are not selected 

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
    }

    @Test
    public void radioButtonTest() throws InterruptedException {
        WebElement createAccountButton=driver.findElement(By.linkText("Create New Account"));
        createAccountButton.click();
        Thread.sleep(3000);
        WebElement femaleButton=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        femaleButton.click();
    }
//    @After
//    public void tearDown() {
//       driver.close();
//    }
}
