# Composite Pattern

## Introduce

Composite Compose objects into tree structures to represent part-whole hierarchies.<br>
Composite lets clients treat individual objects and compositions of objects uniformly.

## In JDK

* Includes in JSP
* java.util.Map#putAll(Map)
* java.util.List#addAll(Collection)
* java.util.Set#addAll(Collection)
* java.nio.ByteBuffer#put(ByteBuffer) (also on CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
* java.awt.Container#add(Component) (practically all over Swing thus)