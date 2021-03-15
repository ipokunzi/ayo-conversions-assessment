# ayo-conversions-assessment
Convert metrics to imperials and vice versa
Application Start Up
1. Import app into IDE 

2. To build app goto app root i.e conversions and type 
	mvn clean install -P build-ui into a terminal
	this will build a jar find in the target directory
	
3. To run app goto app root i.e conversions and type 
	java -jar target/conversions.jar
	
4. To view UI in your prefered browser type http://localhost:8080/
	You should see a UI displaying conversion from metrics to imperials
	
5. To run unit test right-click src/test/java/com/conversions/ConversionsApplicationTest.java and select Run As -> Java Application


6. To test endpoints in Postman  
Select GET and type the following URLs
	1. localhost:8080/api/v1/conversions/squarekilometerstosquaremiles/1 = 0.386102
	2. localhost:8080/api/v1/conversions/squaremilestosquarekilometers/1 = 2.589989
	3. localhost:8080/api/v1/conversions/kilometerstomiles/1 = 0.621371
	4. localhost:8080/api/v1/conversions/milestokilometers/1 = 1.609344
	5. localhost:8080/api/v1/conversions/poundstokilograms/1 = 0.453593
	6. localhost:8080/api/v1/conversions/kilogramstopounds/1 = 2.20462
	7. localhost:8080/api/v1/conversions/kelvintocelsius/0 = -273.15
	8. localhost:8080/api/v1/conversions/celsiustokelvin/0 = 273.15
	9. localhost:8080/api/v1/conversions/milliliterstoliters/1 = 0.001
	10. localhost:8080/api/v1/conversions/literstomilliliters/1 = 1000.0
