# Decorator Pattern

## Introduce

Decorator add additional responsibilities dynamically to an object.

## In JDK

* All subclasses of java.io.InputStream, OutputStream, Reader and Writer have a constructor taking an instance of same type.
* Almost all implementations of java.util.List, Set and Map have a constructor taking an instance of same type.
* java.util.Collections, the checkedXXX(), synchronizedXXX() and unmodifiableXXX() methods.
* javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper
* Display tag custom tag library proved option to decorator for rendering of tables in JSP.