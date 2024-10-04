@authentification
Feature: Authentification  
En tant qu'utilisateur, je souhaite me connecter

  @login-password-valide
  Scenario: Connexion réussie avec des informations valides
    Given je visite l'application Orange HRM 
    When je saisis le login "Admin"
    And je saisis le mot de passe "admin123"
    And je clique sur le bouton Login
    Then je me redirige vers la page Home


   @login-password-invalide
  Scenario: Connexion réussie avec des informations valides
    Given je visite l'application Orange HRM
    When je saisis le login "leila@yourstore.com"
    And je saisis le mot de passe "leila"
    And je clique sur le bouton Login
    Then je verifie le message d'erreur 
