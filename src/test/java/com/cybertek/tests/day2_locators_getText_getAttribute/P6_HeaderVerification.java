package com.cybertek.tests.day2_locators_getText_getAttribute;
// Zero Bank header verification
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        //driver.findElement(By.tagName("h3")); // find element returns WebElement
        String actualText = driver.findElement(By.tagName("h3")).getText(); //returns String
        String expectedText = "Log in to ZeroBank";

        if (actualText.equals(expectedText)) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }










    }
}
