
---

# Information Générale

Bienvenue, futurs geeks ! Ici, nous nous intéressons aux algorithmes en Java. Un algorithme est la description d'une suite d'étapes permettant d'obtenir un résultat à partir d'éléments fournis en entrée. Nous allons donc résoudre des algorithmes ensemble.

# Prérequis

Avoir des bases en :

- Java *(savoir écrire une fonction en Java)*
- Git et GitHub *(maîtriser les commandes de base en Git)*

> Il est nécessaire d'avoir au minimum un compte GitHub. [Créer un compte GitHub](https://github.com)

# À Installer

Si vous avez déjà **VS Code**, **Java**, et **Git** installés sur votre machine, vous pouvez ignorer cette étape.

- VS Code : [Télécharger VS Code](https://code.visualstudio.com/download)
- Java (version minimum 13) : [Télécharger Java](https://www.oracle.com/java/technologies/downloads/)
- Git : [Télécharger Git](https://git-scm.com/downloads)

# Première Étape

1. Ouvrez un terminal/cmd à partir de votre environnement de travail (Bureau/Document/etc...) et exécutez ces commandes :

   ```bash
   # Cloner le projet sur votre machine locale
   git clone https://github.com/Geek-237/java_challenge

   # Se déplacer vers le dossier du projet
   cd java_challenge

   # Ouvrir le projet avec VS Code
   code .
   ```

2. Lancez les tests qui se trouvent dans le fichier `ChallengeTest.java` (src/test/java/de/geek237/library/java_challenge/ChallengeTest.java). Vous remarquerez que de nombreux tests échouent (affichés en rouge), ce qui est dû au fait que les méthodes correspondantes n'ont pas encore été implémentées.

> Le but de ce projet est d'implémenter les méthodes pour que les tests correspondants réussissent (deviennent verts).

> **NB : Ne modifiez pas les tests.**

3. Ouvrez le fichier `Challenge.java` (src/main/java/de/geek237/library/java_challenge/Challenge.java) et lisez attentivement les énoncés, ou consultez les issues sur GitHub. Chaque méthode correspond à une issue sur GitHub.

# Implémentation des Méthodes

1. L'implémentation des méthodes doit être effectuée dans le fichier `ChallengeImpl.java` (src/main/java/de/geek237/library/java_challenge/ChallengeImpl.java).
2. Remplacez le `//TODO CODE HERE` par votre solution.

> - Ne modifiez pas le nom de la méthode, ses paramètres, et son type de retour.
> - Vous pouvez créer d'autres méthodes d'aide, mais leur visibilité doit être `private`.
> - Sentez-vous libre de résoudre l'algorithme. Bonne chance !

3. Une méthode est correctement implémentée lorsque le test correspondant réussit (devient vert). Bravo, vous avez résolu un algorithme !

4. Il est maintenant temps de soumettre votre solution. Suivez ces étapes pour gérer votre issue et créer une pull request :

   1. Sélectionnez un issue à résoudre et créez une branche avec la convention `issue-<numéro_issue>-nom_de_la_branche`.
   
   2. Après avoir résolu l'issue, mettez le ticket en PR (pull request) et ajoutez en commentaire l'image du test devenu vert. Signalez dans le groupe que vous avez terminé.

   3. Pour soumettre une solution, ouvrez le terminal intégré de VS Code et saisissez :

      ```bash
      # Pour s'assurer d'avoir la dernière version
      git pull

      # Créer une nouvelle branche avant d'ajouter vos changements
      git checkout -b issue-<numéro_issue>-nom_de_la_branche

      # Ajouter votre fichier modifié
      git add ChallengeImpl.java

      # Committer vos changements
      # Remplacer <numéro_issue> par le numéro de l'issue et <nom_de_la_fonction> par le nom de l'algorithme
      git commit -m "Closes #<numéro_issue>; <nom_de_la_fonction> done"

      # Pousser votre branche vers GitHub
      git push --set-up

stream origin issue-<numéro_issue>-nom_de_la_branche
      ```

> - La commande `git pull` est utilisée pour télécharger le contenu d'un repository distant et immédiatement mettre à jour le repository local pour que le contenu corresponde.
> - Avec `git add`, vous ajoutez une modification du répertoire de travail à l'environnement de staging. Elle indique à Git d'inclure les mises à jour d'un fichier donné dans le prochain commit.
> - La commande `git commit` capture un instantané des modifications actuellement déployées du projet. Les instantanés commités sont considérés comme des versions "sûres" d'un projet.
> - `git push` est utilisée pour télécharger le contenu d'un repository local vers un repository distant.

# Technologie Utilisée

- Java version 13
- JUnit 4
- Maven

---
