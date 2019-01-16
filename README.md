Ce document a pour objectif de vous aider à utiliser l'application.

Table des Matières : 1 - Prérequis 2 - Execution 3 - Utilisation 4 - Fonctionalités 5 - Ressources complémentaires

ATTENTION : Ce document contient des informations importantes pour le fonctionnement de ProxiBanqueV4. Veuillez le lire attentivement pour vous assurer la meilleure expérience possible. Les développeurs ne sauraient être tenus responsables d'une mauvaise utilisation de l'application découlant d'une mauvaise ou absence de lecture de ce document.

1 - Prérequis. Avant de lancer ProxiBanqueV4, vous devez vous assurer que Java est bien installé sur votre appareil. Si ce n'est pas le cas, vous pouvez le télécharger à cette adresse : https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html Pensez bien à vérifier le niveau de votre Système d'exploitation avant de télécharger. Vous pouvez vérifier votre système d'exploitation sous Windows dans Panneau de Configuration -> Système et Sécurité -> Système. Votre niveau de Système correspond à l'indication 32bits ou 64bits, et vous devez télécharger la distribution de Java correpondante. Vous devez également avoir un outil pour décompresser les fichiers installé sur votre ordinateur. Si vous n'en avez pas, vous pouvez en télécharger un gratuitement ici : https://www.7-zip.org/ De même téléchargez bien la version correspondant à votre niveau de Système. Afin d'utiliser l'application de manière optimale, nous vous recommendons d'utiliser Google Chrome. Vous pouvez télécharger Google Chrome ici : https://www.google.com/chrome/. Encore une fois n'oubliez pas de vérifier le niveau de votre Système. Afin de pouvoir profiter de l'application , il est nécessaire de télécharger et d'installer Tomcat. Il est téléchargeable à l'adresse suivante : https://tomcat.apache.org/download-80.cgi. Veuillez choisir l'installation correspondante à votre système d'exploitation dans "Binary Distributions --> Core". Par exemple, pour Windows 7 ou supérieur, veuillez cliquer sur "64-bit Windows.zip". Une fois l'archive téléchargée, veuillez l'extraire sur votre PC, le dossier de destination n'ayant pas d'importance. Il est également nécessaire de définir une nouvelle variable d'environnement "JRE_HOME". Pour cela, dans l'explorateur de fichiers, faites clic droit sur "Ce PC" -> Propriétés. Selectionnez "Paramètres système avancés" sur la gauche. Dans la fenêtre ouverte, choisir "variables d'environnement". Sous le tableau "Variables système", Cliquer sur nouvelle : En "Nom de variable" indiquer JRE_HOME et en chemin de variable, il faut récupérer le chemin vers l'installation du jre ( par défaut C:\Programmes\java\jrexxx ).

Pour avoir accès aux informations de la base de données, veuillez télécharger l'application MySQL à l'adresse suivante : https://dev.mysql.com/downloads/windows/installer/8.0.html. Selectionnez l'installation à 313Mo. Bien vérifier que MySQL Workbench est installé.

2 - Exécution. Afin de deployer l'application ProxiBanqueV4, veuillez coller l'archive proxibanquev4_Benoit_Bixente_Omar.war  et proxibanquev4_Angula_Benoit_Bixente_Omar.war dans le dossier webapps de votre dossier apache-tomcat-8.5.35. Ensuite, allez dans le dossier bin et double cliquez sur le fichier "startup.bat". Attendre qu'un dossier proxibanquev4 apparaisse. Veuillez ensuite lancer MySQL Workbench et créer un nouveau schéma nommé "proxibanquefinal". Ensuite, selectionner "Server" dans le menu supérieur puis "Data import". Selectionner l'option "Import from Self-Contained File et renseigner le chemin vers le fichier structure.sql fourni. Indiquer "proxibanquefinal" dans "Default Target Schema". Enfin, répéter l'opération précédente avec le script "data.sql" fourni afin d'importer les données proprement dites. Pour faire fonctionner l'application Angular en mode développements, installer node.js à l'adresse suivante : "https://nodejs.org/en/download/", puis dans le repertoire contenant le projet Angular executer les commandes "npm install" et "ng serve" pour deployer le serveur.

__________BACKEND__________

Pour lancer l'application, lancer chrome et rentrer l'adresse suivante : "http://localhost:8080/proxibanquefinal".

3 - Utilisation. Le BACKEND permet de vérifier si un sondage est valide. Si la phrase "Le sondage a débuté le yyyy-mm-dd et finit le yyyy-mm-dd" est visible, le sondage est actif. Si la phrase "Pas de sondage en cours" est visible, aucun sondage n'est actif. Si un sondage est actif le bouton "Arrêter un sondage" est présent dans la page, son activation permet de fermer le sondage actuellement actif. Si aucun sondage n'ai en cours, le bouton "Créer un sondage" est visible, son activation fait apparaitre une nouvelle page permettant de créer un nouveau sondage avec les champs : "Date de début (yyyy-mm-dd)" et "Date de fin prévisionnelle (yyyy-mm-dd)". Pour confirmer, un bouton "valider le nouveau sondage" permet de faire persister le nouveau sondage dans la base de données. Un bouton "Retour" permet de revenir en arrière.

Un Bouton "visualiser les retours des sondages" permet d'afficher une nouvelle page contenant le détails des sondages avec "Numero du sondage", "Date de début", "Date de fin prévisionnelle", "Nombre d'avis positif", "Nombre d'avis negatif" et "Détails". Le bouton "Détails" ouvre une nouvelle page contenant la liste des clients (enregistré dans la base de données) ayant repondu favorablement au sondage avec leur Nom + Prenom, mais aussi la liste des commentaires négatifs, préalablement rempli par les utilisateurs. Les commentaires vide n'apparaissent pas dans la page détails.

__________FRONTEND__________

Pour lancer l'application, lancer chrome et rentrer l'adresse suivante : "http://localhost:4200/proxibanquefinal".

3 - Utilisation. Le FRONTEND permet de vérifier si un sondage est valide. Si la phrase "Obtenir un devis d'assurance Automobile Simple - Rapide - Gratuit" est visible, le sondage est actif. Si la phrase "Voudriez-vous adhérer à un service d’assurance automobile Proxibanque?" est visible, aucun sondage n'est actif. Si un sondage est actif, un bonton "Telephone" est présent contenant le telephone de l'agence, mais aussi un bouton "mail" contenant le mail de l'entreprise. Si aucun sondage n'est actif, deux bouton pouces positif et négatif sont présents. Le pouce baissé active un formulaire permettant d'enregistrer un commentaire non-obligatoire avec l'avis négatif. Le pouce en l'air active un formulaire permettant de s'identifier si le client est présent dans la base de données et de sauvegarder le client avec l'avis négatif. Si le client ne rentre pas de numero, ou marque un numero erroné, seul l'avis positif est enregistré.

Pour tester l'application voici des exemples de numero de client present dans la base de donné :

◦ 00123465
◦ 00124578
◦ 00123415

Une fois que votre usage de l'application touche à son terme, lancez le fichier "shutdown.bat" dans le même dossier que "startup.bat"(Apache Tomcat/bin).

__________BACKEND__________

4 - Fonctionalités. ProxiBanquev4 vous permet ces fonctionalités :

Arreter un sondage déjà en cours.
Créer un sondage.
Voir la liste des sondages passés et ceux en cours.
Avoir le détails des clients ayant laissé un avis positif (uniquement ceux enregistrés), et voir la liste des commentaires rempli en même temps que les avis négatifs.

__________FRONTEND__________

4 - Fonctionalités. ProxiBanquev4 vous permet ces fonctionalités :

Avoir accès au télephone et mail de l'entreprise. (sondage actif)
Avoir la possibilité de laisser un avis positif ou négatif. (sondage inactif)

5 - Ressources complémentaires. L'application ProxiBanqueV4 est livrée avec :

Un diagramme de classe UML représentant le modèle de données utilisé par le Backend.

Un dossier « scripts » avec les jeux de données SQL permettant de tester.

Un dossier backend avec uniquement
◦ Le dossier « src » contenant toutes les sources.
◦ Le fichier de configuration du projet Maven.
◦ Un WAR de l’application prêt à déployer sur l’URL identique au nom du ZIP livré.

Un dossier frontend avec
◦ Tout le projet excepté les dossiers « node_modules » et le dossier «dist».
◦ Un WAR de l’application prêt à déployer sur une URL de votre choix.

Il est également possible de consulter le code de ProxiBanqueV4 à l'adresse suivante : "https://github.com/Dashism/proxibanqueFINAL" et "https://github.com/Dashism/proxibanqueFINAL-ANGULAR".