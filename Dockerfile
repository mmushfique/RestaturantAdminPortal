FROM openjdk:17
EXPOSE 8080
ADD target/kfcAdminPortal.war kfcAdminPortal.war
ENTRYPOINT ["java","-war","/kfcAdminPortal.war"]