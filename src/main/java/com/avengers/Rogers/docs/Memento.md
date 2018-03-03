# Memento Pattern

## Introduce

Memento capture the internal state of an object without violating encapsulation and thus providing a mean for restoring the object into initial state when needed.

## In JDK

* java.util.Date (the setter methods do that, Date is internally represented by a long value)
* All implementations of java.io.Serializable
* All implementations of javax.faces.component.StateHolder