# Android Lab : Gestion de Formulaire et Transfert de Données
 ## Présentation du projet
Ce projet consiste en une application Android native développée en Java. L'objectif est de démontrer la maîtrise du cycle de vie des activités et la communication entre écrans via les Intents.

L'application se décompose en deux parties :

Formulaire de saisie : Collecte des informations utilisateur (Nom, Email, Téléphone, Adresse).

Récapitulatif : Affichage dynamique des données reçues sur un second écran.

## Fonctionnalités techniques
Interface utilisateur (UI) : Utilisation de ScrollView pour assurer la compatibilité avec tous les écrans et de LinearLayout pour une structure verticale claire.

Validation de saisie : Vérification si les champs critiques (Nom et Email) sont remplis avant l'envoi, avec affichage de Toast en cas d'erreur.

Transmission de données : Utilisation de l'objet Bundle pour encapsuler les données et de la méthode putExtras() pour les envoyer via un Intent explicite.

UX (Expérience Utilisateur) : * Configuration des inputType (e-mail, téléphone) pour adapter le clavier.

Gestion du retour à l'écran précédent via la méthode finish().

## Structure du Code
1. Écran de saisie (MainActivity)
Le point d'entrée de l'application. Il initialise les composants graphiques et gère l'événement "clic" sur le bouton de transmission.

Méthode clé : processTransmission() qui vérifie le contenu des EditText et prépare le voyage vers l'écran suivant.

2. Écran de résultat (ResultActivity)
Cet écran réceptionne le "paquet" envoyé.

Méthode clé : getIntent().getExtras() pour déballer les informations et les afficher de manière formatée dans un TextView dédié.

 ## Aperçu de l'application

Écran 1 : Formulaire: Saisie des coordonnées 

<img width="394" height="866" alt="Screenshot 2026-03-22 231950" src="https://github.com/user-attachments/assets/db95c300-7b55-4496-acac-f4353f81bb28" />


Écran 2 : Confirmation: Visualisation du profil transmis

<img width="397" height="866" alt="Screenshot 2026-03-22 232001" src="https://github.com/user-attachments/assets/80eae935-8127-4ec7-867c-a98fc693e467" />


Note : Dans l'exemple testé, l'utilisateur dahmad a transmis avec succès ses coordonnées depuis Marrakech.

## Installation & Test
1) Cloner le dépôt ou copier les fichiers sources.

2) Ouvrir le projet dans Android Studio.

3) Vérifier que les activités sont bien déclarées dans le AndroidManifest.xml.

4) Lancer l'application sur un émulateur ou un appareil physique (API 21+).

## Concepts clés abordés
Intent Explicite

Bundle & Key-Value pairs

Layout XML & Design Material

Cycle de vie Android (onCreate)
