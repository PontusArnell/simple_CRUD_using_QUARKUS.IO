Hej!

Jag har inte skrivit i Quarkus.io tidigare men v�ldigt smoth upplevelse
t�nker forts�tta med det kanske.

F�r att starta

./mvnw compile quarkus:dev

Jag anv�nde mig av verktyget code.quarkus.io f�r att generara en enkel CRUD jsonb service

F�r att se om det �r online:
http://localhost:8080/hello-resteasy

borde returnera f�ljande: "Hello RESTEasy totaly great"


Keep it simple KISS. Har inte tagit bort den endpointen ovan, utan endast lagt
till egen text. Uppdaterat testet naturligtsvis

F�ljde guiden f�r REST p� quarkus.io, skapade en bean Customer.java och en 
CustomerResource.java. P� LTH sa de anv�nd private ist�llet f�r public och 
getters setters, men s�g i guiden att de hade public i sin bean s� att jag
gjorde s�.

GET listar alla
POST l�gger till
PUT uppdaterar
DELETE tar bort

v�ldigt enkelt, ingen authentisering eller databas, bara in och ur minnesstruktur p� servern

anv�nde mig av JUnit f�r att testa CustomerResource.

http requests anv�nd CURL

   // f�r kolla upp hur jag g�r det h�r som automatiska test eller s� �r det n�got jag missat,
    // Mer van med "vanlig" unittest Junit. Finns en till CustomerREsourceTest i se.odsmalsgranar.rest.json som k�r vanlig jUnit 
    
    // T�nk p� att implementationen med namn som nyckel vid borttagning och uppdatering i en hashmap.  Hands on testning nedan:
    
    //det fungerar med f�r att lista alla
    // $ curl http://localhost:8080/digg/user 
    
    // att l�gga till user
    // $ curl -X POST -H "Content-Type: application/json" -d '{"name":"Gunnar","adress":"Hittep�v�gen 13, 6742143 Staden","email":"ts@acme.org","phone":"555"}' http://localhost:8080/digg/user

    // ta bort user
    // $ curl -X DELETE -H "Content-Type: application/json" -d '{"name":"Gunnar","adress":"Hittep�v�gen 13, 6742143 Staden","email":"ts@acme.org","phone":"555"}' http://localhost:8080/digg/user

    // uppdatera user
    // $ curl -X PUT -H "Content-Type: application/json" -d '{"name":"Gunnar","adress":"Hittep�v�gen 13, 6742143 Staden","email":"ts@acme.org","phone":"555"}' http://localhost:8080/digg/user
	


Visst det k�rs och finns tester men �r det verkligen production ready code? 

Sj�lv t�nker jag mest p� att jag anv�nder mig av namnet som id i delete och update men inte kollar 
n�r man l�gger in nya object i listan om namnet redan finns, hashmapen kanske fixar det , men 
har v�l inte sagt �t den att name �r nyckeln......

Vid en snabb check verkar inte det h�r vara n�got problem, men jag har inte gjort tester f�r det.


Jag antar att arbetsprovet mer �r av typen, kan du f� ig�ng n�got och vet vad Test Driven Development �r?

Mvh Pontus Arnell
 0703945992
 pontus.arnell@gmail.com
 
 
 
	
 