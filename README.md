# ContactManager-Spring-mvc-heroku
Spring boot App made for contact management. Made using spring mvc, hibernate, sts4, PostgreSQL and deployed on Heroku.


#IMPORTANT#
On this repo, I have removed the applications.property file for hiding my credentials.
In case you want to deploy it on your own add the application.properties file in the "src\main\resources" folder.

-------------------------------------------------------------------------------------------------------------------------------------
Your application.properties file should look like:


server.port=8081

spring.mvc.view.prefix=/WEB-INF/view/
spring.mvc.view.suffix=.jsp
spring.datasource.url=jdbc:postgresql://Hostname:5432/DatabaseName
spring.datasource.username= your_username
spring.datasource.password= your_password

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true

---------------------------------------------------------------------------------------------------------------------------------------
