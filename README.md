# 🎯 Questions de réflexion et réponses

## Partie 1 : Création du Service Web

**1. Pourquoi utilise-t-on une interface plutôt qu'une classe directement ?**  
- L’interface définit le contrat du service : quelles méthodes sont disponibles.  
- Elle permet de séparer la définition du service (interface) de la logique métier (implémentation).  
- Cela favorise la flexibilité, le test unitaire et le remplacement facile de l’implémentation.  

**2. Que se passerait-il si on oublie l'annotation `@WebMethod` ?**  
- La méthode ne serait pas exposée comme opération SOAP dans le WSDL.  
- Les clients générés ou appelants SOAP ne pourraient pas l’utiliser.  

---

## Partie 1.2 : Implémentation du Service

**1. Pourquoi afficher des messages dans la console ?**  
- Pour tracer l’activité du service, savoir quand une méthode est appelée et avec quelles valeurs.  
- Utile pour le debug et pour l’enseignement.  

**2. Comment pourrait-on rendre le taux de conversion dynamique ?**  
- En le récupérant depuis une API externe ou une base de données au lieu d’une constante.  
- Par exemple, en appelant un service de taux de change en ligne.  

---

## Partie 2 : Publication du Service

**1. Que contient le fichier WSDL ?**  
- La description complète du service : méthodes disponibles, paramètres, types de retour, et points d’accès (endpoints).  

**2. Pourquoi utilise-t-on `localhost` ?**  
- Pour tester localement le service sur la machine de développement avant de le déployer.  

**3. Que se passe-t-il si on change le port 8080 ?**  
- Le client doit pointer vers le nouveau port pour accéder au service.  
- Sinon, les requêtes SOAP échoueront.  

---

## Partie 3 : Création du Client

**1. Quelle est la différence entre l'interface et l'implémentation d'un service web ?**  
- L’interface définit le contrat du service (méthodes disponibles).  
- L’implémentation contient la logique métier réelle qui s’exécute lorsque les méthodes sont appelées.  

**2. À quoi sert le fichier WSDL ?**  
- Il sert de contrat machine-readable pour générer automatiquement les classes client.  
- Il décrit comment accéder au service et quelles méthodes sont disponibles.  

**3. Pourquoi doit-on générer des classes avec `wsimport` ?**  
- Pour créer des proxies Java qui simplifient les appels SOAP.  
- Le client peut alors appeler les méthodes du service comme des méthodes Java normales.  

**4. Que se passe-t-il si le serveur n'est pas démarré quand on lance le client ?**  
- Le client ne pourra pas se connecter au service et générera une erreur `WebServiceException`.  

---

## Questions d'Approfondissement

**1. Comment pourriez-vous ajouter une méthode pour convertir Euro → Dollar ?**  
- Ajouter la méthode dans l’interface `ConversionService` et son implémentation dans `ConversionServiceImplementation`.  
- Recompiler et republier le service, puis régénérer les classes client avec `wsimport`.  

**2. Comment récupérer un taux de conversion dynamique depuis une API externe ?**  
- Utiliser `HttpClient` ou une librairie similaire pour faire un appel REST vers une API de taux de change.  
- Remplacer la constante `TAUX_CONVERSION` par la valeur récupérée.  

**3. Quels sont les avantages et inconvénients de SOAP par rapport à REST ?**  
- **Avantages SOAP** : protocole standardisé, sécurité intégrée (WS-Security), transactions, support natif des contrats via WSDL.  
- **Inconvénients SOAP** : plus lourd, plus complexe à déboguer, moins flexible pour des clients légers.  
- **REST** : plus simple, plus léger, très utilisé pour les APIs web modernes, mais moins standardisé pour les transactions et la sécurité.  

---

## ⚙️ Notes sur l’exécution

- Pour l’exécution, voir les captures :  
  - `Server-Capture.png` → serveur publié et accessible  
  - `Client-Capture.png` → client Java exécuté et affichant la conversion et le timestamp  

**Explication technique :**  
- Lorsque j’ai généré les classes client avec `wsimport`, j’avais déjà créé un répertoire `client/generated`.  
- Cela a créé un `client/generated` supplémentaire à l’intérieur, ce qui a nécessité de spécifier le chemin exact lors de la compilation et de l’exécution du client.  
- Grâce à cette méthode, le client a pu compiler et s’exécuter correctement, comme visible sur `Client-Capture.png`.  

---

## 📚 Resources used

- [StackOverflow: Unable to run wsimport utility in JDK8](https://stackoverflow.com/questions/23555188/unable-to-run-wsimport-utility-in-jdk8)  
- [IBM Docs: wsimport command JAX-WS applications](https://www.ibm.com/docs/fr/was-zos/8.5.5?topic=file-wsimport-command-jax-ws-applications)  
- [Oracle Docs: javax.xml.ws.Service](https://docs.oracle.com/javaee/7/api/javax/xml/ws/Service.html?utm_source=chatgpt.com)  
- [Oracle Docs: java.net.URL](https://docs.oracle.com/javase/7/docs/api/java/net/URL.html?is-external=true)  
- [Oracle Docs: javax.xml.namespace.QName](https://docs.oracle.com/javase/7/docs/api/javax/xml/namespace/QName.html?is-external=true)  
