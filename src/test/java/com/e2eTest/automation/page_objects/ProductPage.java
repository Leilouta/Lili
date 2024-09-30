package com.e2eTest.automation.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	
	// Locateurs d'éléments
	private WebDriver driver;

    private By bouttonAjouterAuPanier = By.id("add-to-cart");
    private By nomDeProduit = By.id("product-name");
    private By panier = By.id("cart-icon");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ajouterAuPanier() {
        driver.findElement(bouttonAjouterAuPanier).click();
    }

    public String getProductName() {
        return driver.findElement(nomDeProduit).getText();
    }

    public void goToPanier() {
        driver.findElement(panier).click();
    }

    public boolean isProductInCart(String productName) {
    	/** Cette méthode doit vérifier si le produit est présent dans le panier.
         Vous devrez adapter le sélecteur selon le HTML de votre page de panier.*/
    	
        return driver.findElement(By.xpath("//div[contains(text(), '" + productName + "')]")).isDisplayed();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
