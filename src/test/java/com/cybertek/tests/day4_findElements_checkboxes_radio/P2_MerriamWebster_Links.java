package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P2_MerriamWebster_Links {
    public static void main(String[] args) {

        //TC #2  FindElements
        //1. Open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");

        //3. Print out the texts of all links
        List<WebElement> listOfLinks =driver.findElements(By.xpath("//body//a"));

        int LinksWithoutText =0;
        int LinksWithText =0;

        for(WebElement eachLink : listOfLinks){
            String textOfEachLink = eachLink.getText();

            System.out.println(textOfEachLink);
            if(textOfEachLink.isEmpty()){
                LinksWithoutText++;
            }else{
                LinksWithText++;
            }
        }

        //4. Print out how many links are missing text
        System.out.println("The number of Links that do not have text = " + LinksWithoutText);

        //5. Print out how many links have texts
        System.out.println("The number of Links that have text = " + LinksWithText);

        //6. Print out how many are in total links
        System.out.println("The number of total links on this page " + listOfLinks.size());


    }
}
