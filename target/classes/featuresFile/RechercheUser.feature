@rechercheUSer
Feature: Recherche Username 
En tant que Administrateur je veux rechercher un username 

  @RechercherUnUsername
  Scenario: Connexion réussie avec des informations valides
    Given je visite l'application Orange HRM 
    When je saisis le login "Admin"
    And je saisis le mot de passe "admin123"
    And je clique sur le bouton Login
    Then je me redirige vers la page Home
    And je clique sur Admin 
    And je saisie le username "Annamae" 
    And je clique sur Search 
    And je verifie que la liste s'affiche avec le user correspondant 
    