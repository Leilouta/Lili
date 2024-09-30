@authentification
Feature: Authentification  Entant que utlisateur je souhaite me connecter

  @login-valide
  Scenario: je souhaite tester la page LOGIN
    Given je visite l'application NopCommerce
    When je saisie l'adresse mail
    And je  saisie le Login
    And je saisie le mot de passe
    And je clique sur le boutton Login
    Then je mre redirige vers la page Home
