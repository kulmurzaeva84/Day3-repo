package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// TC #3 : Back and Forth navigation
public class P3_NavigationsAndTitleVerification {
    public static void main(String[] args) {

        //1. Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to https://google.com
        driver.get("https://google.com");

        //3. Click on Gmail from top right
        // we are locating web element using FindElement method and linkText locator
        driver.findElement(By.linkText("Gmail")).click();

        //4. Verify title contains
        //Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Gmail title verification PASSED");
        }else{
            System.out.println("Gmail title verification FAILED");
        }

        //5. Go back to Google by using the .back();
        driver.navigate().back();

        // 6. Verify title equals:
       // Expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title verification PASSED");
        }else{
            System.out.println("Google title verification FAILED");
        }









    }
}
