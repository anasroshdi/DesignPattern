# DesignPattern


# 1- Behavioural Design pattern

## Chain of Responsibility

 - allows for you to apply multiple handler for the request and pass it to the next handler in the chain  


## Strategy 

 - avoid using if statement for easing the maintenance process


# 2- Creation Design Pattern

## Factory Method

- creational design pattern that provides an interface for creating 
objects in a superclass, but allows subclasses to alter the type
of objects that will be created.


- The Factory Method pattern suggests that you replace direct object construction
calls (using the new operator) with calls to a special factory method. 
Don’t worry: the objects are still created via the new operator, but it’s being called from within the factory method. Objects returned by a factory method are often referred to as products.


## Abstract Factory

- it is gathering two object or more with each other without specifying a concrete object if they are related somehow to each others like building a
UI (Button & Alert) for mac , windows and linux each combination of those will be different according to OS

