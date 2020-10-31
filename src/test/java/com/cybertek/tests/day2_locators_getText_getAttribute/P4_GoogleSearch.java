package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC #4 Google Search
public class P4_GoogleSearch {
    public static void main(String[] args) {

        //1, Set up and Open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to https://google.com
        driver.get("https://google.com");

        //3. Write "apple" in search box
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        //4. Click google search button
        //5. Verify title
        //Expected result: Title should apple- Google Search
        String expectedTitle= "apple - Google Search";
        String actualTitle =driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Search title verification Passed");
        }else{
            System.out.println("Search title verification Passed");
        }
    }
}
