# Chain of Responsibility

## Introduce

Chain of Responsibility avoids attaching the sender of a request to its receiver,<br>
giving this way other objects the possibility of handling the request too.<br>
The objects become parts of a chain and the request is sent from one object to another across the chain until one of the objects will handle it.

## In JDK

* java.util.logging.Logger#log()
* javax.servlet.Filter#doFilter()