# Template Pattern

## Introduce

In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. <br>
Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. <br>
This pattern comes under behavior pattern category.

## In JDK

* java.io.InputStream, java.io.OutputStream, java.io.Reader, java.io.Writer all non-abstract methods 
* java.util.AbstractList, java.util.AbstractSet, java.util.AbstractMap all non-abstract methods
* javax.servlet.http.HttpServlet#doXXX()   