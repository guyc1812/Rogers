# Mediator Pattern

## Introduce

Mediator pattern is used to reduce communication complexity between multiple objects or classes. <br>
This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling. <br>
Mediator pattern falls under behavioral pattern category.

## In JDK

* java.util.Timer#scheduleXXX() 
* java.util.concurrent.Executor#execute()
* java.util.concurrent.ExecutorService#invokeXXX(),submit() 
* java.util.concurrent.ScheduledExecutorService#scheduleXXX()
* java.lang.reflect.Method#invoke()   