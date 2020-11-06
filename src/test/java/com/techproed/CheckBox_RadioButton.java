package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBox_RadioButton {
//    Create a class : CheckBox_RadioButton 
//    Go to https://the-internet.herokuapp.com/checkboxes 
//    Locate the elements of checkboxes 
//    Then click on checkbox1 if box is not selected 
//    Then click on checkbox2 if box is not selected

    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void checkboxTest() throws InterruptedException {
        //    Locate the elements of checkboxes 
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        //    Then click on checkbox1 if box is not selected 
        //    How do you know if a checkbox is selected or not?
        //    Answer: isSelected(); method
        Thread.sleep(5000);
        if(!checkbox1.isSelected()) {
            checkbox1.click();
        }
        Thread.sleep(5000);

        //    Then click on checkbox2 if box is not selected
        if(!checkbox2.isSelected()) {
            checkbox2.click();
        }
    }
    public void tearDown() {

        driver.close();
    }
}
