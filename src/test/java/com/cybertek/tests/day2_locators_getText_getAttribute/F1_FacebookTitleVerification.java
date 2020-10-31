package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_FacebookTitleVerification {

    public static void main(String[] args) {
        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        //2. Opening browser
        WebDriver driver = new ChromeDriver();

        //3. Verify title
        //Expected result: Facebook - Login or Sign Up
        String expectedTitle ="Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Facebook title verification passed!");
        }else{
            System.out.println("Facebook title verification failed!");
        }


    }
}
