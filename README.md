# Virtual-Assistance-
AWS Hacthaon







Spring Boot is an open source Java-based framework used to create a micro Service. It is developed by Pivotal Team and is used to build stand-alone and production ready spring applications.

How to run this Application :-

Download the zip or clone the Git repository.
Unzip the zip file (if you downloaded one)
Open Command Prompt and Change directory (cd) to folder containing pom.xml
Open Eclipse
File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
Select the project

mvn spring-boot:run


URLs
URL	Method	Remarks
http://localhost:5000/getavaliblefightInfo/{source}/{destination}	GET	getavaliblefightInfo
		
http://localhost:5000/api/file/upload?uploadfile               	GET	uploadfile
		
http://localhost:5000/getbyId/{id}	GET	getbyId

