# Strategy Pattern

## Introduce

In Strategy pattern, a class behavior or its algorithm can be changed at run time. <br>
This type of design pattern comes under behavior pattern.<br>
In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. <br>
The strategy object changes the executing algorithm of the context object.

## In JDK

* java.util.Comparator#compare()
* javax.servlet.http.HttpServlet
* javax.servlet.Filter#doFilter() 