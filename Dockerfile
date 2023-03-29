FROM openjdk:17
EXPOSE 8080
ADD target/kfcAdminPortal.jar kfcAdminPortal.war
ENTRYPOINT ["java","-war","/kfcAdminPortal.war"]