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

## Demo

* AbstractFactory.java

    ```java
    public abstract class AbstractFactory {
       abstract Color getColor(String color);
       abstract Shape getShape(String shape) ;
    }
    ```
    
* ShapeFactory.java
    
    ```java
    public class ShapeFactory extends AbstractFactory {
        
       @Override
       public Shape getShape(String shapeType){
           switch (shapeType){
               case "Circle":
                   return new Circle();
               case "Rectangle":
                   return new Rectangle();
               case "Square":
                   return new Square();
               default:
                   System.out.println("Wrong Shape!");
                   return null;
           }           
       }
       
       @Override
       public Color getColor(String color) { return null; }
       
    }
    ```

* ColorFactory.java

    ```java
    public class ColorFactory extends AbstractFactory {
        
       @Override
       public Color getColor(String color) {      
           switch (color){
              case "Red":
                  return new Red();
              case "Green":
                  return new Green();
              case "Blue":
                  return new Blue();
              default:
                  System.out.println("Wrong Color!");
                  return null;
          }   
       }
       
       @Override
       public Shape getShape(String shapeType){ return null; }
     
    }
    ```

* FactoryProducer.java
 
    ```java
    public class FactoryProducer {
    
       public static AbstractFactory getFactory(String choice){   
          switch (choice){
              case "SHAPE":
                  return new ShapeFactory();
              case "COLOR":
                  return new ColorFactory();
              default:
                  return null;
          }
       }
     
    }
    ```
    
* Main.java

    ```java
    public static void main(String[] args) {
    
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor("RED");
        color.fill();
        
    }
    ```
