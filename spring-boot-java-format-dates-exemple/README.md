## Spring Boot - Java 8 Date Time
Dans ce projet, nous allons voir des exemples de Java 8 Date Time. Nous passerons en revue les nombreuses méthodes et bibliothèques que vous pouvez utiliser pour convertir une chaîne Java en un objet date.

### Contexte
---
Convertir une chaîne en une date en Java (ou dans n'importe quel langage de programmation) est une compétence fondamentale et utile à connaître lorsque vous travaillez sur des projets.
* **L'API Date/Time** - fonctionne avec le format ISO 8601 par défaut, qui est `(yyyy-MM-dd)`.
* **parse()** - méthode qui accepte une séquence de caractères et utilise le ISO_LOCAL_DATEformat pour analyser l'entrée `parse(CharSequence);`.

### Exemples Java 8 Date Time
---
* **Obtenir la date et l'heure actuelles en Java**
* **Conversion String en LocalDateTime** - `LocalDateTime` c'est la classe la plus utilisée concernant Date/Heure en Java. Il représente une combinaison de date et d'heure et peut être utilisé à plusieurs fins.
* **Conversion String à l'aide d'un formateur personnalisé** - Parfois, nous pourrions souhaiter utiliser notre propre formateur personnalisé, qui accepte une chaîne de différentes manières et ne lance toujours pas de `DateTimeParseException`.
* **SimpleDateFormat vs DateTimeFormatter** - `DateTimeFormatter` a été ajouté dans Java 8 avec la nouvelle API Date/Time, et remplace l'ancien, désormais moins fréquemment utilisé `SimpleDateFormat.
*Remarque : Si vous utilisez Java 8 et la nouvelle API, utilisez DateTimeFormatter, tandis que si vous utilisez toujours une ancienne version de Java, utilisez SimpleDateFormat.*
* **Formater les dates avec SimpleDateFormat**
* **Formater les dates avec DateTimeFormatter**
* **Comparer des dates en Java**
* **Joda-Time** - a été développé pour contrer les problèmes avec les anciennes classes d'heure et de date Java.
```
<dependency>
    <groupId>joda-time</groupId>
    <artifactId>joda-time</artifactId>
    <version>{version}</version>
</dependency>
```

### Prérequis
---
Pour travailler dans un projet Spring Boot, vous auriez besoin des spécifications suivantes :<br/>
- Spring Boot v2.0+<br/>
- JDK v1.8+<br/>
- Maven 3+ ou Gradle 4+ - outil de construction<br/>
- Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSCode, NetBeans, etc.)<br/>

### Dependances Maven
---
Dans ce projet nous allons utiliser les dependances de base suivants :
* **Spring Web** - pour inclure Spring MVC et utilise le tomcat comme conteneur intégré par défaut.
* **Spring Boot DevTools** - dépendance pour les rechargements automatiques ou le rechargement en direct des applications.

Voilà ! Nous avons couvert plusieurs façons de convertir une chaîne simple en classes Date et Date-Time en Java. Certaines de ces approches utilisent des bibliothèques tierces que vous avez peut-être déjà dans votre projet, et certaines sont réalisées à l'aide des offres d'API Java.