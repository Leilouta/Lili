
/**
 * Cette méthode permet à l'utilisateur de rechercher un produit sur le site Jumia.
 * 
 * Elle prend en paramètre le nom du produit que l'utilisateur souhaite rechercher. 
 * 
 * Le processus de recherche implique les étapes suivantes :
 * 1. **Saisie du Texte** : La méthode localise le champ de recherche à l'aide de son sélecteur XPath ou ID, puis saisit le texte correspondant au nom du produit. 
 *    Cela permet de simuler l'action d'un utilisateur qui tape dans la barre de recherche.
 * 
 * 2. **Soumission de la Recherche** : Après avoir saisi le nom du produit, la méthode localise le bouton de recherche. 
 *    En cliquant sur ce bouton, la requête de recherche est soumise, et le site affiche les résultats correspondants.
 * 
 * 3. **Gestion des Exceptions** : En cas de problème lors de l'interaction avec les éléments de la page (par exemple, si les éléments ne sont pas trouvés),
 *    la méthode peut inclure une gestion d'exceptions pour informer l'utilisateur ou enregistrer une erreur dans les logs. Cela permet d'améliorer la robustesse 
 *    de l'application et de faciliter le débogage en fournissant des messages d'erreur explicites.
 */
package com.e2eTest.automation.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	// Locateurs d'éléments
	private WebDriver driver;
    private By boxRechercher = By.xpath("//input[@type='text']"); 
    private By boutonRechercher = By.xpath("//button[@class='btn _prim _md -mls -fsh0']"); 
  

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Naviguer vers la page d'accueil de Jumia
    
    public void navigerSurJumia() {
        driver.get("https://www.jumia.fr");
    }

    // Rechercher un produit
    public void rechercherUnProduit(String productName) {
        driver.findElement(boxRechercher).sendKeys(productName);
        driver.findElement(boutonRechercher).click();
    }

    
    
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

