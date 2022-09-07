# Spring-Basics
My notes and code from the spring course

## Spring Development Process:
>Configure your Spring Beans (In xml file).
>Create a Spring Container (Application Context).
>Retreive beans from spring container (using getBean() func we talk to the container).

## Spring Bean:
>A "Spring Bean" is simply a Java object.
>When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".
>Spring Beans are created from normal Java classes, just like Java objects.

## Dependancy Injection:
    two common types:
        >Constructor Injection
        >Setter Injection

## Bean Scope:
    >Singleton: One bean memory is shared when retireved from container.
    >Prototype: A new bean is created each time a bean is retrieved from container.