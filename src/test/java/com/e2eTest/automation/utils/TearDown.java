package com.e2eTest.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
public class TearDown {
	 /**
     * Cette méthode est exécutée après chaque scénario Cucumber.
     * Elle capture un écran si le scénario a échoué et ferme le WebDriver.
     * 
     * @param scenario le scénario en cours d'exécution
     */
	
	@After
	public void quitDriver(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Setup.getdriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshoot");
		}

		Setup.getdriver().quit();
		Setup.getLogger().error("Scenario:" + scenario.getName() + "-finishedStatus" + scenario.getStatus());
	}

}
