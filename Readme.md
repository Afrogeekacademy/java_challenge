Salut les futurs geeks, ici on a à faire avec des algorithme en java.
Un algorithme est la description d'une suite d'étapes permettant d'obtenir un résultat à partir d'éléments fournis en entrée.  Alors ici nous allons résoudre des algorithmes.

pré-requis: de base en java et git

Comment travailler:
1). cloner le project: git clone ...
2) ouvrir le project avec intelij ou vs code
3) lire les énoncés et essayer de résoudre les algos

(a) Sur intelij éxécuté tout les tests
(b) Vous remarquez quelques tests sont rouge

5)
Les tests sont rouges car les functions ne sont pas implémenté correctement, le but de ce project est d'implémenter les méthodes les afin que les tests correspondant deviennent vert.
NB: ne modifier pas les tests

4) chaque methode correspond à un issues
5) la méthodes est bien implémenté lorsque le test correspondant devient  vert et bravo car vous avez résoulu un algorithme,
6) maintenant il est temps de soumettre votre solution
7) pour soumettre une solution on ouvre le terminal intégré d'intelij et on saisi: git pull (pour se rassurer qu'on a la dernière version) ensuite git add ChallengeImp.java ensuite git commit -m "#<issus-nummer> even_or_odd done" ensuite git push

Technologie utilisée: java, maven, junit4

docker run -d --name dev_youtrack \
-v /var/www/youtrack/data:/opt/youtrack/data \
-v /var/www/youtrack/conf:/opt/youtrack/conf \
-v /var/www/youtrack/logs:/opt/youtrack/logs \
-v /var/www/youtrack/backups:/opt/youtrack/backups \
-p 8080:8080 \
-p 8443:8443 \
jetbrains/youtrack:2022.2.59587


