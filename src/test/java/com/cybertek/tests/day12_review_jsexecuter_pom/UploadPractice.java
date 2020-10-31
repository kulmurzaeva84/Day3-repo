package com.cybertek.tests.day12_review_jsexecuter_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {


    @Test
    public void uploading_file_test(){
        // Getting the page
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        Driver.getDriver().manage().window().maximize();
        // get the path of the file you want to upload
        // Mac: right click on the file you want to upload
        // Click and hold option button and select copy as path name

        // Windows: Right click -> properties -> copy from the location
        // Or Shift+ right click --> Copy as path
        String path = "/Users/kai/Downloads/stargirl.jpg";

        // Locate the upload web element
        WebElement uploadInput = Driver.getDriver().findElement(By.id("file-upload"));

        // send the path of the file to uploadInput webElement
        BrowserUtils.wait(3);
        uploadInput.sendKeys(path);

        //locate the UPLOAD button
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        //click to upload button
        BrowserUtils.wait(2);
        uploadButton.click();


    }

}
