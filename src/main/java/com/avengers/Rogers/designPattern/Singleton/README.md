# Singleton Pattern

## Introduce

Singleton pattern is one of the simplest design patterns in Java.<br>
This type of design pattern comes under creation pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created.<br>
This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

## In JDK

* java.lang.Runtime#getRuntime()
* java.awt.Desktop#getDesktop()

## Demo

```java
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
```

## Note:

**When using double check, *volatile* is required**

* Why double check

    ```java
    public static Singleton getInstance() {
        if (uniqueInstance == null) {                  //<- 1
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();  //<- 2
                }
            }
        }
        return uniqueInstance;
    }
    ```

    **原因1：指令重排**

    `singleton = new Singleton();`
    
    1. 给singleton分配内存 
    1. 在内存中初始化singleton对象 
    1. 将内存地址赋给singleton变量(singleton!=null)
    
    指令重排之后可能为
    
    1. 给singleton分配内存 
    1. 将内存地址赋给singleton变量(singleton!=null)
    1. 在内存中初始化singleton对象
    
    当 **T1** 执行到 **语句2** 时，由于指令重排，<br>
    导致singleton!=null，但是singleton所指向的内存空间并未初始化对象
    
    此时 **T2** 执行到 **语句1** 时，由于singleton!=null直接返回，<br>
    那么使用此对象则报错。
    
    **原因2：变量不可见，工作内存副本**
    
    线程 T1, T2 同时执行到 **语句1**，各自保存副本到线程工作内存，<br>
    此时 T1 执行完 **语句2** 但是没来得及写回主存，<br>
    T2 拿到 null 的单例变量后则会再次创建
    
* Why volatile

    1. 确保 **"happens before"** 原则，使用 **"内存屏障"** 的方式来防止指令重排
    1. 确保可见性

    
    
