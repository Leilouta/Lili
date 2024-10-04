package com.e2eTest.automation.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	/** properties. */
	private Properties properties;

	/** property file path. */
	private final String propertyFilePath = "src/test/resources/configs/ConfigFile.properties";

	/**
	 * Instanciation de config file reader.
	 */
	public ConfigFileReader() {
		properties = new Properties();
		try (BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath))) {
			properties.load(reader);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath, e);
		} catch (IOException e) {
			throw new RuntimeException("IOException occurred while reading the Configuration.properties file.", e);
		}
	}

	/**
	 * Accesseur de l attribut driver path.
	 * 
	 * @return driver path
	 */
	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null) {
			return driverPath;
		} else {
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
		}
	}

	/**
	 * Accesseur de l attribut property.
	 *
	 * @param property le nom de la propriété à récupérer
	 * @return la valeur de la propriété
	 */
	public String getProperty(String property) {
		String prop = properties.getProperty(property);
		if (prop != null) {
			return prop;
		} else {
			throw new RuntimeException(
					"Property '" + property + "' not specified in the Configuration.properties file.");
		}
	}
}
