package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfTest {
    private static Properties property;
    private final String propertyFilePath = "src/main/resources/config.properties";



    public ConfTest() {
        FileInputStream fileInputStream = null;
        try {
            property = new Properties();
            fileInputStream = new FileInputStream(propertyFilePath);
            property.load(fileInputStream);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getLogin(){
        return property.getProperty("login");
    }

    public static String getPassword(){
        return property.getProperty("password");
    }

    public static String getTestEMail(){
        return property.getProperty("testemail");
    }

    public static String getText(){
        return property.getProperty("message");

    }

    public static String getUrl(){
        return property.getProperty("url");
    }

    public static String getFilePath(){
        return property.getProperty("path");
    }
}