package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {
    public static void main(String[] args) {

        /*TC #1: Google Title Verification
        1. Open Chrome browser
        set up the browser driver
         */
        WebDriverManager.chromedriver().setup();
        // if you are using browser driver locally, you need to use System.setProperty every time
        // we user WebDriverManager

        //open a chrome browser
        // we create an instance of the ChromeDriver, which opens a blank browser for us
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.google.com
        driver.get("https://www.google.com");

        //3. Verify title:
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        //Expected: Google




    }
}
