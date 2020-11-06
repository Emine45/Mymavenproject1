package com.techproed;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenClass {
    public static void main(String[] args) {
        //STEP 1: Create WebDriverManager
        WebDriverManager.chromedriver().setup();

        //STEP 2: Create ChoreDriver
        WebDriver driver = new ChromeDriver();

        //STEP 3: Go to the webpage that you want
        driver.get("https://www.google.com");

        //Search for a random name
        Faker faker = new Faker();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(faker.name().fullName()+ Keys.ENTER);
      //  searchBox.sendKeys(faker.address().cityName()+ Keys.ENTER);





    }
}
