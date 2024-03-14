From eclipse-temurin:17
COPY Target/webapp.jar webapp.jar 
CMD [ "java","-jar","webapp.jar"]