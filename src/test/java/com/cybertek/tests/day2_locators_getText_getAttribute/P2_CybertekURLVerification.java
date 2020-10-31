package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// TC#2: Cybertek URL Verification
public class P2_CybertekURLVerification {
    public static void main(String[] args) {
        //TC #2: Cybertek verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //this line will maximize the browser page
        driver.manage().window().fullscreen();


        //2. Go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        //3. Verify URL contains
        //Expected: cybertekschool
        String expectedInURL = "cybertekschool";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedInURL)){
            System.out.println("URL Verification PASSED");
        }else{
            System.out.println("URL Verification FAILED");
        }

        //4. Verify title:
        //Expected: Practice
        //actual result             expected result
        if(driver.getTitle().equals("Practice")){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

    }
}
