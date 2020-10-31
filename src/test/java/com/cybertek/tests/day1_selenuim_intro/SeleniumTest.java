package com.cybertek.tests.day1_selenuim_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        //1- setup the web driver
        WebDriverManager.chromedriver().setup();

        //2 - create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();  // opens the browser

        //3 - test if driver is working
        driver.get("https://www.google.com");  // driver, get me this link

        System.out.println("The title of the page is: "+ driver.getTitle());

        String actualTitle = driver.getTitle(); // this is another way of getting a title
        System.out.println("Actual title is: "+actualTitle);

        String actualURL = driver.getCurrentUrl();
        System.out.println("Actual URL: "+ actualURL);

      //  actualURL.soutv ==> shortcut for sout where v stands for value

        Thread.sleep(2000);  // throws InterruptedException, waits for 2 sec(2000 milliseconds)

        driver.navigate().back(); // takes you to the previous page

        Thread.sleep(3000);

        driver.navigate().forward();  // takes you to the next page

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.navigate().to("https://www.facebook.com");

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource); // returns String


        //driver.manage().window().fullscreen();  expands the screen, this one works only on Mac
        driver.manage().window().maximize();  // this one works for both Windows and Mac

        driver.close();// closes all of the browsers opened in that session
    }
}
