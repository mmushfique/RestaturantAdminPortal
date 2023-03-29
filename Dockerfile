FROM openjdk:17
EXPOSE 8080
ADD target/kfcAdminPortal.jar kfcAdminPortal.jar
ENTRYPOINT ["java","-jar","/kfcAdminPortal.jar"]