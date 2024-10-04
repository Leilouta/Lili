package com.e2eTest.automation.step_defintions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage loginPage;
	public ConfigFileReader configFileReader;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader(); 
	}

	/* LOGIN VALIDE */
	@Given("je visite l'application Orange HRM")
	public void jeVisiteLApplicationNopCommerce() {

		Setup.getDriver().get(configFileReader.getProperty("home.url"));
	}

	@When("je saisis le login {string}")
	public void jeSaisisLAdresseMail(String email) {
		LoginPage.getEmail().sendKeys(email);

	}

	@When("je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {

		LoginPage.getPassword().sendKeys(password);

	}

	@When("je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.getBtnLogin().click();

	}

	@Then("je me redirige vers la page Home")
	public void jeMeRedirigeVersLaPageHome() {

	}

	/* LOGIN INVALIDE */

	@Then("je verifie le message d'erreur")
	public void jeVerifieLeMessageDErreur() {

	}

}
