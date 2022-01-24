## Spring Boot - Java 8 Streams exemples
---
Dans ce projet, nous allons voir quelques exemples de Java 8 Streams avec Spring Boot.
C'est un traitement de données avancés utilisant une nouvelle fonctionnalité ajoutée à Java 8 - L'API Stream et l'API Collector.

### Qu'est-ce qu'un flux ?
Java 8 du package `java.util.stream` introduit un concept de flux qui permet au programmeur de traiter les données 
de manière descriptive et de s'appuyer sur une architecture multicœur sans avoir besoin 
d'écrire de code spécial.<br/><br/>
Un `Stream` représente une séquence d'objets dérivés d'une source, sur laquelle des opérations d'agrégation peuvent être effectuées.
C'est une interface typée - un Stream de T. Cela signifie qu'un flux peut être défini pour n'importe quel type 
d'objet , un flux de nombres, un flux de caractères, un flux de personnes ou même un flux d'une ville.

### Quelques définitions clés
---
* **Un Stream ne contient aucune donnée** : Il n'y a pas de données dans un Stream , cependant, il y a des données dans une Collection.
La `Collection` est une structure qui contient ses données. Un flux est juste là pour traiter les données et les extraire de la source donnée, ou les déplacer vers une destination.
* **Un Stream ne doit pas modifier la source** : Un Stream ne doit pas modifier la source des données qu'il traite. Éviter ce type d'interférence signifie que nous ne devons pas modifier la source des données pendant que nous les traitons.
* **Une source peut être illimitée** : Cela signifie que le Stream en lui-même peut traiter autant de données que nous le souhaitons.

### Caractéristiques du Stream
---
* Séquence d'éléments - Le Stream obtient un élément à la demande et ne stocke jamais un élément.
* Source - Les Stream prennent une collection, un tableau ou des ressources d'E/S comme source pour leurs données.
* Opérations agrégées - Les Stream prennent en charge les opérations agrégées telles que forEach, filter, map, sorted, match, etc.
* Overriding - Leurs résultats peuvent être chaînés. La fonction de ces opérations est de prendre les données d'entrée, de les traiter et de renvoyer la sortie cible. La méthode `collect()` est une opération terminale qui est généralement présente à la fin des opérations pour indiquer la fin du traitement Stream.
* Itérations automatisées - Les opérations de Stream effectuent des itérations en interne sur la source des éléments

### Prérequis
---
Pour ce projet, vous auriez besoin des spécifications suivantes :
* Spring Boot v2.0+
* JDK v1.8+
* Maven 3+ ou Gradle 4+ - outil de construction
* Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSC, NetBeans, etc.)

### Des exemples
---
Nous pouvons générer un Stream à l'aide de quelques méthodes :
* La méthode `stream()`
* La méthode `parallelStream()`
* La méthode `Stream.builder()`
* Filtrage avec un Stream
* Mappage avec un Stream
* Collecter avec un Stream
* Correspondance (Matching ) avec un Stream

Voilà ! nous avons réalisé des exemples de Java 8 Streams avec Spring Boot. Une approche plus récente de la programmation et représentent une touche de programmation de style fonctionnel avec des expressions lambda pour Java que c'est nécessairement une meilleure approche.