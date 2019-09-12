# This is starter dependancy for Spring Boot Ripper example

Little bit discription:

1) Firstly DevProfileResolverEnvironmentPostProcessor add that implements EnvironmentPostProcessor. 
This class contatins logic that sets active profile "DEV" if environment variable "OS" is "Windows".

2) In the next stage ProdNotificationListener was added. This class implements ApplicationListener and does works for print emails on console.

3) NotificationProp has annotation @ConfigurationProperties with prefix = "prod". It allows sets values for properties in properties file.

4) ProfileStopperApplicationInitializer throws Exception if current environment does not have activ profile. 
This class implements ApplicationContextInitializer.

5) Configuration class conteins ProdNotificationListener bean that enable only with all conditionals below:
- active profile is "PROD"
- Bean with name ProdNotificationListener is absent (@ConditionalOnMissingBean(name = "prodNotificationListener"))
- property "notification" in properties is true or missing (@ConditionalOnProperty(name = "prod.notification", matchIfMissing = true, havingValue = "true"))



Getting started
-git clone https://github.com/lahmenev/Boot-ripper-starter.git
- mvn install
- add dependancy below to your pom.xml

```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
```
