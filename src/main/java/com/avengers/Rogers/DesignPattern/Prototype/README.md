# Prototype Pattern

## Introduce

Prototype pattern refers to creating duplicate object while keeping performance in mind. <br>
This type of design pattern comes under creation pattern as this pattern provides one of the best ways to create an object.<br>

This pattern involves implementing a prototype interface which tells to create a clone of the current object. <br>
This pattern is used when creation of object directly is costly. <br>

For example, an object is to be created after a costly database operation. <br>
We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.<br>

## In JDK

* java.lang.Object#clone() (the class has to implement java.lang.Cloneable)
