# Visitor Pattern

## Introduce

In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class. <br>
By this way, execution algorithm of element can vary as and when visitor varies. <br>
This pattern comes under behavior pattern category. <br>
As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object.

## In JDK

* javax.lang.model.element.AnnotationValue, AnnotationValueVisitor 
* javax.lang.model.element.Element, ElementVisitor 
* javax.lang.model.type.TypeMirror, TypeVisitor 
 