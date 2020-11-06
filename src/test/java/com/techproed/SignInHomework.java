package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInHomework {
//1. Create a class SignInHomework
//2. Go to http://automationpractice.com/index.php
//3. Click on sign in button
//4.Send your email and click on create an account button
//5.Verify the Text : CREATE AN ACCOUNT
//6. Verify the Text : YOUR PERSONAL INFORMATION
//7. Verify the Text : Title
//8. Select your title
//9. Enter your first name
//10. Enter your last name
//11. Enter your email
//12. Enter your password
//13. DO NOT ENTER DATE OF BIRTH-YOU DIDN'T LEARN DROPDOWN YET
//14. Click on Sign up for our newsletter!
//15. Enter your first name
//16. Enter your last lane
//17. Enter your company
//18. Enter your Address
//19. Enter your City
//20. DO NOT SELECT STATE-YOU DIDN'T LEARN DROPDOWN YET
//21. Enter Postal Code
//22.DO NOT SELECT COUNTRY-
//23. Enter additional information
//24. Enter home phone
//25. Enter mobile phone
//26. Enter reference name
//27. Click Register
//    THEN YOU SHOULD SEE SOME ERROR MESSAGE. TAKE A SCREENSHOT AND SHARE WITH ME
//====
//    Be careful about putting some wait.

    WebDriver driver;
    @Before
    public void setUp() {
     //2. Go to http://automationpractice.com/index.php
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }
    @Test
    public void signIn() throws InterruptedException {
     //3. Click on sign in button
        WebElement signIn = driver.findElement(By.linkText("Sign in"));
        signIn.click();

     //4.Send your email and click on create an account button
        WebElement emailAccountButton = driver.findElement(By.id("email_create"));
        emailAccountButton.sendKeys("Amerika@gmail.com");
        Thread.sleep(1000);
        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();

     //5.Verify the Text : CREATE AN ACCOUNT
        WebElement createAccountText = driver.findElement(By.className("page-heading"));
        Assert.assertTrue(createAccountText.isDisplayed());

     //6. Verify the Text : YOUR PERSONAL INFORMATION
        WebElement personalInformationText = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[1]"));
        Assert.assertTrue(personalInformationText.isDisplayed());

     //7. Verify the Text : Title
        WebElement titleText = driver.findElement(By.xpath("//label[1]"));
        Assert.assertTrue(titleText.isDisplayed());

     //8. Select your title
        WebElement selectTitle = driver.findElement(By.id("id_gender2"));
        selectTitle.click();

     //9. Enter your first name
        WebElement firstNameButton = driver.findElement(By.id("customer_firstname"));
        firstNameButton.sendKeys("Emily");

     //10. Enter your last name
        WebElement lastNameButton = driver.findElement(By.id("customer_lastname"));
        lastNameButton.sendKeys("Arlington");

     //11. Enter your email
        WebElement emailButton = driver.findElement(By.xpath("//input[@id='email']"));
        Assert.assertTrue(emailButton.isDisplayed());

     //12. Enter your password
        WebElement passwordButton = driver.findElement(By.id("passwd"));
        passwordButton.sendKeys("12345");

     //14. Click on Sign up for our newsletter!
        WebElement signUpNewsletterButton = driver.findElement(By.id("newsletter"));
        signUpNewsletterButton.click();

     //15. Enter your first name
        WebElement firstName2 = driver.findElement(By.xpath("//input[@name='firstname']"));
        Assert.assertTrue(firstName2.isDisplayed());

     //16. Enter your last lane
        WebElement lastName2 = driver.findElement(By.xpath("//input[@name='lastname']"));
        Assert.assertTrue(lastName2.isDisplayed());

     //17. Enter your company
        WebElement companyButton = driver.findElement(By.id("company"));
        companyButton.sendKeys("VERIZON");

     //18. Enter your Address
        WebElement addressButton = driver.findElement(By.id("address1"));
        addressButton.sendKeys("innovation dr.");

     //19. Enter your City
        WebElement cityButton = driver.findElement(By.xpath("//input[@id='city']"));
        cityButton.sendKeys("California");

     //21. Enter Postal Code
        WebElement postalCodeButton = driver.findElement(By.xpath("//input[@class='form-control uniform-input text']"));
        postalCodeButton.sendKeys("12323");

     //23. Enter additional information
        WebElement additionalInformationButton = driver.findElement(By.xpath("//textarea[@name='other']"));
        additionalInformationButton.sendKeys("No information");

     //24. Enter home phone
        WebElement homePhone = driver.findElement(By.xpath("//input[@id='phone']"));
        homePhone.sendKeys("1234567890");

     //25. Enter mobile phone
        WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
        mobilePhone.sendKeys("0987654321");

     //26. Enter reference name
        WebElement referenceName = driver.findElement(By.xpath("//input[@id='alias']"));
        referenceName.sendKeys("Tech");

     //27. Click Register
        WebElement registerButton = driver.findElement(By.xpath("//button[@id='submitAccount']"));
        registerButton.click();

    }
}
