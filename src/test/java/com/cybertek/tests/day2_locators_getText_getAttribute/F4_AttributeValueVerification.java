package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {

    public static void main(String[] args) {

        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        //2. Opening browser
        WebDriver driver = new ChromeDriver();
        // Go to "https://www.facebook.com"
        driver.get("https://www.facebook.com");

        //3. Verify "Create a page" link href value contains text:
        //Expected: "registration form"

        String expectedInAttribute = "registration form";
        String actualAttribute = driver.findElement(By.linkText("Create a Page")).getAttribute("href");

        System.out.println("expectedInAttribute =  "+ expectedInAttribute);
        System.out.println("actualAttribute = "+ actualAttribute);

        if(actualAttribute.contains(expectedInAttribute)){
            System.out.println("Attribute value verification Passed!");
        }else{
            System.out.println("Attribute value verification FAiled!");
        }

        String usingGetTextMethod = driver.findElement(By.linkText("Create a Page")).getText();
        System.out.println("usingGetTextMethod = "+ usingGetTextMethod);

    }
}
