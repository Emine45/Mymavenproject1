package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X {
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
   }
   @Test
    public void SignIn() throws InterruptedException {
       WebElement signIn = driver.findElement(By.linkText("Sign in"));
       signIn.click();
       WebElement createAccount = driver.findElement(By.id("email_create"));
       createAccount.sendKeys("aykuterenkara@gmail.com" + Keys.ENTER);
       WebElement verifyCreateAccount = driver.findElement(By.className("page-heading"));
       Assert.assertTrue(verifyCreateAccount.isDisplayed());
       WebElement verifyYourPersonalInfo = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[1]"));
       Assert.assertTrue(verifyYourPersonalInfo.isDisplayed());
       WebElement verifyWordTitle = driver.findElement(By.xpath("//label[1]"));
       Assert.assertTrue(verifyWordTitle.isDisplayed());
       Thread.sleep(2000);
       WebElement selectTitle = driver.findElement(By.xpath("//div[@class='radio'][1]"));
       selectTitle.click();
       Thread.sleep(2000);
       WebElement name = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
       name.sendKeys("Aykut" + Keys.TAB + "Erenkara"
               + Keys.TAB + "aykuterenkara@gmail.com" + Keys.TAB + "12345");
       WebElement newsletter = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
       newsletter.click();
       Thread.sleep(2000);
       WebElement name2 = driver.findElement(By.xpath("//input[@name='firstname']"));
       name2.sendKeys("" + Keys.TAB + "Erenkara"
               + Keys.TAB + "AE" + Keys.TAB + "Paterson" + Keys.TAB + Keys.TAB + "New Jersey" + Keys.TAB + Keys.TAB + "07503"
               + Keys.TAB + Keys.TAB + "OK!" + Keys.TAB + "123456789" + Keys.TAB + "987654321" + Keys.TAB + "World");
       WebElement register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
       register.click();
   }

}