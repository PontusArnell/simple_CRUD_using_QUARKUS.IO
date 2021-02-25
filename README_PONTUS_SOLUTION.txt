Hej!

Jag har inte skrivit i Quarkus.io tidigare men väldigt smoth upplevelse
tänker fortsätta med det kanske.

För att starta

./mvnw compile quarkus:dev

Jag använde mig av verktyget code.quarkus.io för att generara en enkel CRUD jsonb service

För att se om det är online:
http://localhost:8080/hello-resteasy

borde returnera följande: "Hello RESTEasy totaly great"


Keep it simple KISS. Har inte tagit bort den endpointen ovan, utan endast lagt
till egen text. Uppdaterat testet naturligtsvis

Följde guiden för REST på quarkus.io, skapade en bean Customer.java och en 
CustomerResource.java. På LTH sa de använd private istället för public och 
getters setters, men såg i guiden att de hade public i sin bean så att jag
gjorde så.

GET listar alla
POST lägger till
PUT uppdaterar
DELETE tar bort

väldigt enkelt, ingen authentisering eller databas, bara in och ur minnesstruktur på servern

använde mig av JUnit för att testa CustomerResource.

http requests använd CURL

   // får kolla upp hur jag gör det här som automatiska test eller så är det något jag missat,
    // Mer van med "vanlig" unittest Junit. Finns en till CustomerREsourceTest i se.odsmalsgranar.rest.json som kör vanlig jUnit 
    
    // Tänk på att implementationen med namn som nyckel vid borttagning och uppdatering i en hashmap.  Hands on testning nedan:
    
    //det fungerar med för att lista alla
    // $ curl http://localhost:8080/digg/user 
    
    // att lägga till user
    // $ curl -X POST -H "Content-Type: application/json" -d '{"name":"Gunnar","adress":"Hittepåvägen 13, 6742143 Staden","email":"ts@acme.org","phone":"555"}' http://localhost:8080/digg/user

    // ta bort user
    // $ curl -X DELETE -H "Content-Type: application/json" -d '{"name":"Gunnar","adress":"Hittepåvägen 13, 6742143 Staden","email":"ts@acme.org","phone":"555"}' http://localhost:8080/digg/user

    // uppdatera user
    // $ curl -X PUT -H "Content-Type: application/json" -d '{"name":"Gunnar","adress":"Hittepåvägen 13, 6742143 Staden","email":"ts@acme.org","phone":"555"}' http://localhost:8080/digg/user
	


Visst det körs och finns tester men är det verkligen production ready code? 

Själv tänker jag mest på att jag använder mig av namnet som id i delete och update men inte kollar 
när man lägger in nya object i listan om namnet redan finns, hashmapen kanske fixar det , men 
har väl inte sagt åt den att name är nyckeln......

Vid en snabb check verkar inte det här vara något problem, men jag har inte gjort tester för det.


Jag antar att arbetsprovet mer är av typen, kan du få igång något och vet vad Test Driven Development är?

Mvh Pontus Arnell
 0703945992
 pontus.arnell@gmail.com
 
 
 
	
 