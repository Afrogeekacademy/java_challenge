# Information générale
Salut les futurs geeks, ici on a à faire avec des algorithme en java.
Un algorithme est la description d'une suite d'étapes permettant d'obtenir un résultat à partir d'éléments fournis en entrée.  Alors ici nous allons résoudre des algorithmes.


# Pré-requis
Des bases en:
* Java *(savoir écrire une fonction en java)*{.caption}
* git et github *(métriser les commande de base en git )*{.caption}
> il faut minimun avoir un compte github. (https://github.com)
{.is-info}


# À installer
> Si dans votre machine vous avez déjà **vs code**, **java** et **git** installé, alors sautez cette étape. 
{.is-info}
* vs code (https://code.visualstudio.com/download)
* java version minimun 13 (https://www.oracle.com/de/java/technologies/downloads/)
* git (https://git-scm.com/downloads)


# Première étape
1. ouvrir un terminal/cmd à partir de  votre environement de travail (Bureau/Document/etc...) et éxécuter ces commandes
```bash
#cloner le projet dans votre machine locale
git clone https://github.com/Geek-237/java_challenge

#déplacer vous vers le dossier du projet
cd java_challenge

#ouvrir le projet avec vs code
code .
```
2. faites démarer les tests qui se trouvent dans le fichier `ChallengeTest.java` *(src/test/java/de/geek237/library/java_challenge/ChallengeTest.java)*{.caption}
3. vous remarquez, il y a beaucoup de tests qui ne fonctionne pas (les tests en rouges), cela est du au fait que les méthodes correspondantes n'ont pas encore été implémentées.
> le but de ce project est d'implémenter les méthodes les afin que les tests correspondant deviennent vert.
{.is-info}

> NB: ne modifier pas les tests
{.is-warning}

4. ouvrir le fichier `Challenge.java` *(src/main/java/de/geek237/library/java_challenge/Challenge.java)*{.caption} et bien lire les énoncés. / ou bien aller lire les issues dans le github. 
5. chaque methode correspond dans le github à un issues 


# Implémentation des méthodes
1. L'implémentation des méthodes se déroule dans le fichier `ChallengeImpl.java`  *(src/main/java/de/geek237/library/java_challenge/ChallengeImpl.java)*{.caption}
2. remplacez le `//TODO CODE HERE` par votre solution
> ne modifier pas le nom de la méthode, ses paramètre et son type retour.
> vous pouvez créer d'autre méthodes d'aide mais la visibilité doit ètre `private`
> sentez vous libre et resolvez l'agorithme
> Bonne chance!
{.is-warning}
3. la méthodes est bien implémenté lorsque le test correspondant devient  vert et bravo car vous avez résoulu un algorithme.
4. maintenant il est temps de soumettre votre solution
5. pour soumettre une solution on ouvre le terminal intégré de vs code et on saisi:
```bash
#pour se rassurer qu'on a la dernière version
git pull

#après 
git add ChallengeImpl.java

#ensuite
#remplacer <issus-nummer> par le numéro de l issue et nom_de_la_fonction par le nom de l'algorithme
git commit -m "closes #<issus-nummer>; nom_de_la_fonction done"

#enfin 
git push
```

>  -->La commande `git pull` est utilisée pour télécharger le contenu d'un repository distant et mettre immédiatement à jour le repository local pour que le contenu corresponde.
> --> Avec la commande `git add`, tu ajoutes une modification du répertoire de travail à l'environnement de staging *(environement de test)*{.caption}. Elle indique à Git d'inclure les mises à jour d'un fichier donné dans le prochain commit. *(Un commit Git est un instantané complet de votre repository à un temps t)*{.caption}.
> --> Avec la commande `git commit`, vous capturez un snapshot *(Un «snapshot», c'est un peu une photo du contenu de votre projet à un moment donné. Un snapshot vous permet de «revenir dans le temps» sur un projet.)*{.caption} des modifications actuellement déployées du projet. Les snapshots commandités sont considérés comme des versions "sûres" d'un projet. 
> -->La commande `git push` est utilisée pour télécharger le contenu d'un repository local vers un repository distant.
{.is-info}

# Technologie utilisée
* java version 13
* unit4
* maven




