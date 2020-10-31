package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_LoginTitleVerification {

    public static void main(String[] args) throws InterruptedException{

        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        //2. Opening browser
        WebDriver driver = new ChromeDriver();
        // Go to "https://www.facebook.com"
        driver.get("https://www.facebook.com");

        //3. Enter incorrect Username
        driver.findElement(By.id("email")).sendKeys("anything@gmail.com");

        //4. Enter incorrect Password
        driver.findElement(By.id("pass")).sendKeys("asdf"+ Keys.ENTER);

        //5. Verify Title changed to:
        //Expected result: "Log into Facebook|Facebook";
        String expectedTitle= "Log into Facebook|Facebook";
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }








    }
}
