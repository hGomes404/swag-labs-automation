package org.example.swag.labs.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReader {

    private Properties properties;

    private final String configFilePath = "src/main/resources/application.properties";


    public FileReader() {
        File ConfigFile = new File(configFilePath);

        try {
            FileInputStream configFileReader = new FileInputStream(ConfigFile);
            properties = new Properties();

            try {
                properties.load(configFileReader);
                configFileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("config.properties not found at config file path" + configFilePath);
        }

    }

    public String getApplicationUrl() {
        String applicationUrl = properties.getProperty("app.swag.labs.url");

        if (applicationUrl != null) {
            return applicationUrl;
        } else {
            throw new RuntimeException("Application url not specified in the config.properties file.");
        }
    }

    public String getStandardUser() {
        String username = properties.getProperty("standard.user");

        if (username != null) {
            return username;
        } else {

            throw new RuntimeException("username not specified in the config.properties file.");
        }
    }

    public String getLockedOutUser() {
        String username = properties.getProperty("locked.out.user");

        if (username != null) {
            return username;
        } else {

            throw new RuntimeException("username not specified in the config.properties file.");
        }
    }

    public String getProblemUser() {
        String username = properties.getProperty("problem.user");

        if (username != null) {
            return username;
        } else {

            throw new RuntimeException("username not specified in the config.properties file.");
        }
    }

    public String getPerformanceGlitchUser() {
        String username = properties.getProperty("performance.glitch.user");

        if (username != null) {
            return username;
        } else {

            throw new RuntimeException("username not specified in the config.properties file.");
        }
    }


    public String getPassword() {
        String password = properties.getProperty("every.user.password");

        if (password != null) {
            return password;
        } else {
            throw new RuntimeException("password not specified in the config.properties file.");
        }
    }
}