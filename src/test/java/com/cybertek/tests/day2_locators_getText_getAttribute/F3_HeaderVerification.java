package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {


    public static void main(String[] args) {

        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        //2. Opening browser
        WebDriver driver = new ChromeDriver();
        // Go to "https://www.facebook.com"
        driver.get("https://www.facebook.com");

        //3. Verify header test is as expected:
        //Expected: "Connect with friends and the world around you on FB
        String expectedHeaderText = "Connect with friends and the world around you on FB";
        String actualHeaderText = driver.findElement(By.className("_8eso")).getText();

      //  System.out.println(driver.findElement(By.className("_8eso")));
      //  System.out.println(driver.findElement(By.className("_8eso")).getText());

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header verification passed");
        }else{
            System.out.println("Header verification failed");
        }
    }
}
