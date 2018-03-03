# Adapter Pattern

## Introduce

Adapter convert the interface of a class into another interface clients expect.<br>
Adapter lets classes work together, that could not otherwise because of incompatible interfaces.<br>
Note that there are two types of adapter,<br>
one is class level adapter and other is object level adapter.

## In JDK

* java.io.InputStreamReader(InputStream) (returns a Reader)
* java.io.OutputStreamWriter(OutputStream) (returns a Writer)
* javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()