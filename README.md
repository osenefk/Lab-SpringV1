# lab-springv1
Ce projet est une application java standart. 
Il mets en oeuvre l'injection de dependances avec Spring via un fichier de configuration xml. 
L'application est repartie en trois couches à savoir :
- La couche persistence : contient les classes POJO
- La couche dao : contient les classes accés aux données (Interface + classe Implementant l'interface)
- La couche service : contient les classes implémentant la logique métier de l'application. 
La dependance entre la couche dao et la couche service est gérée par spring : Injection de la classe implémentant l'interface dao (on parle ici d'un couplage fort)
- Et la couche presentation : contient la classe principale pour l'execution du projet
