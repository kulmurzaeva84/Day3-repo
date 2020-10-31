package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P0_FindElements_Practice1 {
    public static void main(String[] args) {

        //TC #0 : FindElements
        //1. Open Chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3 Print out texts of all links
        //shortcut to introduce the local variable is option + enter for mac
        // locating all the links on the page and storing them into a list of webelements
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        // Looping through the list of webelemnts we just created above
        for(WebElement eachLink : listOfLinks){
            System.out.println(eachLink.getText());
        }


        //4. Print out how many total links
        int numberOfLinks = listOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);



    }
}
