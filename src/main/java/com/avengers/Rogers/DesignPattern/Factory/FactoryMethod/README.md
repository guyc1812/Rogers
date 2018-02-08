# Factory Method

## Introduce

Factory pattern is one of the most used design patterns in Java.<br>
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.<br>

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

## In JSDK

* java.lang.Object#toString() (overrideable in all subclasses)
* java.lang.Class#newInstance()
* java.lang.Integer#valueOf(String) (also on Boolean, Byte, Character, Short, Long, Float and Double)
* java.lang.Class#forName()
* java.lang.reflect.Array#newInstance()
* java.lang.reflect.Constructor#newInstance()
