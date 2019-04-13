package com.briteERP.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try {
            String path = "Configuration.properties";

            FileInputStream stream = new FileInputStream(path);

            properties = new Properties();
            properties.load(stream);

            stream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key); }
}
// why we create configreation file?
//basiaclly, we use input filestream method to