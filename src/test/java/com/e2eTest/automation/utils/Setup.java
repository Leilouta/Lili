package com.e2eTest.automation.utils;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Setup {

    private static WebDriver driver;
    private static final Logger LOOGER = LogManager.getLogger(Setup.class);

    /**
     * Cette méthode est utilisée pour initialiser et ouvrir le navigateur spécifié.
     * Elle est appelée avant l'exécution des scénarios Cucumber.
     * 
     * Le navigateur par défaut est Chrome si aucun paramètre n'est spécifié.
     * 
     * @throws IllegalArgumentException si le navigateur spécifié n'est pas pris en charge.
     */
    @Before
    public void SetWebDriver(Scenario scenario) {
        LOOGER.info("Scenario: " + scenario.getName() + " - started");
        String browser = System.getProperty("browser", "chrome"); 

        switch (browser) {
            case "chrome":
              
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                driver = new ChromeDriver(chromeOptions);
                LOOGER.info("Chrome browser started.");
                break;

            case "firefox":
              
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                driver = new FirefoxDriver(firefoxOptions);
                LOOGER.info("Firefox browser started.");
                break;

            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" is not supported.");
        }
    }

    /* Getter */
    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); 
            LOOGER.info("Browser closed.");
        }
    }

    public static Logger getLogger() {
        return LOOGER;
    }
}