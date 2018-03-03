# Simple Factory

## Introduce

Simple Factory Pattern is a Factory class in its simplest form (In comparison to Factory Method Pattern or Abstract Factory Pattern). <br>
In another way, we can say: In simple factory pattern, we have a factory class which has a method that returns different types of object based on given input.

## Demo

```java
public class PhoneFactory {  

    public Phone produce(String brand) {  
        switch (brand) {
            case "Apple":
                return new Iphone();
            case "Samsung":
                return new Galaxy();
            default:
                System.out.println("Wrong Brand!");
                return null;
        }
    }  
    
}  
```

## Update Demo

```java
public class PhoneFactory {  

    public Phone produceApple(){  
        return new Iphone();  
    }  

    public Phone produceSamsung(){  
        return new Galaxy();  
    }  
    
}  
```