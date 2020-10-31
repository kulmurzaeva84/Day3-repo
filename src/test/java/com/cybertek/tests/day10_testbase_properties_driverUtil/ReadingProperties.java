package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

        // Properties: Use Properties class object
        // We create properties object to be able to read configuration.properties file
        // import from java.util
        Properties properties = new Properties();

        // FileInputStream:
        String path ="configuration.properties";
        // we copied from configuration.properties-> copy-> copy path-> Path from content root

        // We need to pass the path from file we want to open in JVM
        FileInputStream file = new FileInputStream(path); // right click and add exception if check exception prompted

        // We will load the file
        properties.load(file);

        // We read from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser")); //properties.getProperty("browser").soutv
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

        // Close the file










    }

    public void using_properties_utility_method(){
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser")); //ConfigurationReader.getProperty("browser").soutv will give this sout
        System.out.println("ConfigurationReader.getProperty(\"username\") = " + ConfigurationReader.getProperty("username"));
        System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));
        //

    }
}
