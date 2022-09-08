# Spring-Basics
My notes and code from the spring course

## Spring Development Process:
* Configure your Spring Beans (In xml file).
* Create a Spring Container (Application Context).
* Retreive beans from spring container (using getBean() func we talk to the container).

## Spring Bean:
* A "Spring Bean" is simply a Java object.
* When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".
* Spring Beans are created from normal Java classes, just like Java objects.

## Dependancy Injection:
### two common types:
* Constructor Injection
* Setter Injection

## Bean Scope:
* Singleton: One bean memory is shared when retireved from container.
* Prototype: A new bean is created each time a bean is retrieved from container.

## Java Annotations:
* Special Labels or markers added to java classes.
* Provide meta data about the classes.
* Processed at compile time or run time for special processing.

### Why spring with annotations:
* XML configs are verbose.
* Configure your spring beans with annotations
* therefore minimising your XML configuration.



### Annotations - Default Bean Names - The Special Case
In general, when using Annotations, for the default bean name, Spring uses the following rule.

If the annotation's value doesn't indicate a bean name, an appropriate name will be built based on the short name of the class (with the first letter lower-cased).

For example:

HappyFortuneService --> happyFortuneService

---

However, for the special case of when BOTH the first and second characters of the class name are upper case, then the name is NOT converted.

For the case of RESTFortuneService

RESTFortuneService --> RESTFortuneService

No conversion since the first two characters are upper case.

### Bean life cycle using spring annotations
* we can mention the life cycle of the bean after setting it as a component using the @Scope() annotation.
* @Scope("singleton) for singleton scope
* @Scope("prototype") for prototype scope

### Bean life cycle methods
* @PostConstruct - init method to call after bean has been constructed. This will execute after constructor and injection of dependencies.
* @PreDestroy - destroy method to call before bean has been destroyed.

### Spring Configuration 
we can create a java configuration file that replaces the xml file that we use to configure our sping container. We can make any java class a config file by adding the annotation @Configuration

## Spring MVC
* Spring way of building web apps UIs in java.
* Leverage a set of reusable UI components.
* Help manage application state for web requests.
