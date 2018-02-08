# Abstract Factory

## Introduce

Abstract factory offers the interface for creating a family of related objects,<br>
without explicitly specifying their classes.<br>
We can simply say that it is higher level of abstraction of factory pattern.<br>

## In JDK

* java.util.Calendar#getInstance()
* java.util.Arrays#asList()
* java.util.ResourceBundle#getBundle()
* java.net.URL#openConnection()
* java.sql.DriverManager#getConnection()
* java.sql.Connection#createStatement()
* java.sql.Statement#executeQuery()
* java.text.NumberFormat#getInstance()
* java.lang.management.ManagementFactory (all getXXX() methods)
* java.nio.charset.Charset#forName()
* javax.xml.parsers.DocumentBuilderFactory#newInstance()
* javax.xml.transform.TransformerFactory#newInstance()
* javax.xml.xpath.XPathFactory#newInstance()
