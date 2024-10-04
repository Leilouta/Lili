package com.e2eTest.automation.step_defintions;
import com.e2eTest.automation.page_objects.PageHome;

import io.cucumber.java.en.Then;

public class HomeStepDefinition {

	public PageHome pageHome;
	public HomeStepDefinition() {
	pageHome = new PageHome(); 
    
	
	}

	@Then("je clique sur Admin")
	public void jeCliqueSurAdmin() {
	   
		PageHome.getAdmin().click();
	}
	
	@Then("je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {
		
		PageHome.getUsername().sendKeys(username);
	   
		
	}
	@Then("je clique sur Search")
	public void jeCliqueSurSearch() {
		
		PageHome.geBouttonSearch().click();

	}

	
	@Then("je verifie que la liste s'affiche avec le user correspondant")
	public void jeVerifieQueLaListeSAfficheAvecLeUserCorrespondant() {

	}
	
}
