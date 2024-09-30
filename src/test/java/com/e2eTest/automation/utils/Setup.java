package com.e2eTest.automation.utils;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Setup {

	private static WebDriver driver;
	private static final Logger LOOGER = (Logger) org.apache.logging.log4j.LogManager.getLogger(Setup.class.getName());

	/**
	 * Cette méthode est utilisée pour initialiser et ouvrir le navigateur spécifié.
	 * Elle est appelée avant l'exécution des scénarios Cucumber.
	 * 
	 * Le navigateur par défaut est Chrome si aucun paramètre n'est spécifié.
	 * 
	 * @throws IllegalArgumentException si le navigateur spécifié n'est pas pris en
	 *                                  charge.
	 */

	@Before
	public void SetWebDriver(Scenario scenario) {
		LOOGER.error("Scenario:" + scenario.getName() + "-started");
		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";
		}

		switch (browser) {

		case "chrome":

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("['stat-maximized']");
			driver = new ChromeDriver(chromeOptions);
			break;

		case "firefox":
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.addArguments("'stat --maximized'");
			driver = new FirefoxDriver(firefoxOptions);
			break;

		default:

			throw new IllegalArgumentException("Browser \"" + "\" is not supported.");

		}
	}

	/* Getter */
	public static WebDriver getdriver() {

		return driver;
	}

	public static Logger getLogger() {
		return LOOGER;
	}
}
