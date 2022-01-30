# jdbcTest


J'ai utilise PostgreSQL pour creer ma base de donnee. J'ai utilise le driver postgresql-42.3.1.jar et l'IDE IntelliJ pour executer mon code.
J'ai ensuite ajouter le driver dans files => proect structures => modules => dependencies 

![Screenshot 2022-01-31 001346](https://user-images.githubusercontent.com/83409958/151720133-f3b6f105-9d82-4545-bf66-493f498488b2.png)

On fait tou dabord les Imports necessaire.
Ensuite on connect le driver a notre base de donnée Postgres en precisante le login et le password utilisé:
![image](https://user-images.githubusercontent.com/83409958/151720224-28bae1d7-9375-4275-b48a-a161ad6f1ff4.png)

On realise un Query qui select tous de la table "students".
![image](https://user-images.githubusercontent.com/83409958/151720318-2fb65dff-37ac-40af-b291-6630ede6ded5.png)

On execute ensuite une boucle qui imprime ce que contient notre table "students" dans la base de donnée.
![image](https://user-images.githubusercontent.com/83409958/151720268-a317c8af-1dca-4f9c-8f79-85660eb042af.png)

A la fin, on n'oublie pas de fermer la connection.
![image](https://user-images.githubusercontent.com/83409958/151720330-b3e0b736-ad04-4bdd-95dd-632b1dc0ea99.png)
