# Design Pattern



## 单一职责原则(SRP：Single responsibility principle)

A class should have only one reason to change.

每个类应该只实现单一的职责



## 开闭原则(Open Close Principle)

Software entities should be open for extension, but closed for modification.

对扩展开放，对修改关闭



## 里氏替换原则(Liskov Substitution Principle)

Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.

任何基类可以出现的地方，子类一定可以出现。

替换原则中，子类对父类的方法尽量不要重写和重载。因为父类代表了定义好的结构，通过这个规范的接口与外界交互，子类不应该随便破坏它。 


## 接口隔离原则(Interface segregation principle)

Many client-specific interfaces are better than one general-purpose interface.

每个接口中不存在子类用不到却必须实现的方法，如果不然，就要将接口拆分。使用多个隔离的接口，比使用单个接口（多个接口方法集合到一个的接口）要好。 


	
## 依赖倒转原则(Dependency inversion principle)

one should “depend upon abstractions, not concretions.”

面向接口编程，依赖于抽象而不依赖于具体。写代码时用到具体类时，不与具体类交互，而与具体类的上层接口交互。 



## 迪米特法则（最少知道原则）(Demeter Principle) 

Each unit should have only limited knowledge about other units: 

only units “closely” related to the current unit.

Each unit should only talk to its friends; don’t talk to strangers.

Only talk to your immediate friends.

一个类对自己依赖的类知道的越少越好。也就是说无论被依赖的类多么复杂，都应该将逻辑封
装在方法的内部，通过 public 方法提供给外部。这样当被依赖的类变化时，才能最小的影响该类。 
最少知道原则的另一个表达方式是：只与直接的朋友通信。类之间只要有耦合关系，就叫朋友关系。耦
合分为依赖、关联、聚合、组合等。我们称出现为成员变量、方法参数、方法返回值中的类为直接朋友。
局部变量、临时变量则不是直接的朋友。我们要求陌生的类不要作为局部变量出现在类中。



## 合成复用原则(Composite Reuse Principle)

Favor delegation over inheritance as a reuse mechanism.

尽量首先使用合成/聚合的方式，而不是使用继承。 

[read more]("https://medium.com/@ipapikas/bonus-solid-series-7-5-law-of-demeter-859ac8b3c4d4")



[设计模式解读]("http://www.uml.org.cn/sjms/201211023.asp")


---


适配器：将一个借接口转换成另一个接口
装饰器：不改变接口，但加入责任
外观:整合复杂接口，让接口更简单

表示类和类之间关系的模式:
* 观察者模式(Observer)
* 迭代器模式(Iterator)
* 责任链模式(Chain of Responsibility)
* 




## 1.创建模式


### Factory

* 简单工厂

    不是一种设计模式，只是一种编程习惯
    
    将需要 实例化的步骤 提取出来变成一个方法，并置于一个单独的 类A 中
    
    此时如果该 实例化的步骤 很复杂，则此 类A 内部的逻辑将十分复杂且难以维护
    
    ```
    Class A
        public Pizza create(String style, String type) {
            Pizza pizza = null;
            if (style.equals("NY")) {
                if (type.equals("cheese")) {
                    pizza = new NYStyleCheesePizza();
                } else if (type.equals("veggie")) {
                    pizza = new NYStyleVeggiePizza();
                } else if (type.equals("clam")) {
                    pizza = new NYStyleClamPizza();
                } else if (type.equals("pepperoni")) {
                    pizza = new NYStylePepperoniPizza();
                }
            } else if (style.equals("Chicago")) {
                if (type.equals("cheese")) {
                    pizza = new ChicagoStyleCheesePizza();
                } else if (type.equals("veggie")) {
                    pizza = new ChicagoStyleVeggiePizza();
                } else if (type.equals("clam")) {
                    pizza = new ChicagoStyleClamPizza();
                } else if (type.equals("pepperoni")) {
                    pizza = new ChicagoStylePepperoniPizza();
                }
            } else {
                System.out.println("Error: invalid type of pizza");
                return null;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return pizza;
        }
    ```    
        
    
    
* 工厂方法
    
    实例化的步骤 抽象成一个 抽象类A
    
    每一个 具体的实例化子类 都继承 类A 并复写 类A 中的 create() 方法
    
    此时每一个 具体的实例化子类 都是一个上述的简单工厂类，但是只需维护与其相关的create逻辑即可。
    
    ```
    Class A
    
        abstract Pizza createPizza(String item);
         
        public Pizza orderPizza(String type) {
            
            Pizza pizza = createPizza(type);
            
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return pizza;
        }
    
    
    Class B extends A
    
        public Pizza createPizza(String item) {
            if (item.equals("cheese")) {
                return new NYStyleCheesePizza();
            } else if (item.equals("veggie")) {
                return new NYStyleVeggiePizza();
            } else if (item.equals("clam")) {
                return new NYStyleClamPizza();
            } else if (item.equals("pepperoni")) {
                return new NYStylePepperoniPizza();
            } else return null;
        }
    
    Class C extends A
    
        public Pizza createPizza(String item) {
            if (item.equals("cheese")) {
                    return new ChicagoStyleCheesePizza();
            } else if (item.equals("veggie")) {
                    return new ChicagoStyleVeggiePizza();
            } else if (item.equals("clam")) {
                    return new ChicagoStyleClamPizza();
            } else if (item.equals("pepperoni")) {
                    return new ChicagoStylePepperoniPizza();
            } else return null;
        }
    
    
    ```
    
* 抽象工厂方法
    
    * 单个工厂方法类中只有一个工厂方法，对应生产一种产品 --- 鼠标
        ```
           每个具体实现类对应该产品的具体品牌
           
               实现类1 - 工厂方法          - 罗技鼠标
               实现类2 - 工厂方法          - 雷蛇鼠标
        ```                                  
                                      
    * 抽象工厂方法类对应 生产一族产品 --- 电脑配件
        ```
           每个工厂中有多种工厂方法
                   方法1 - 鼠标
                   方法2 - 键盘
                           
           实现类1 - 罗技电脑配件
           
               实现类方法1(工厂方法)       - 罗技鼠标
               实现类方法2(工厂方法)       - 罗技键盘
               
           实现类2 - 雷蛇电脑配件
           
               实现类方法1(工厂方法)       - 雷蛇鼠标
               实现类方法2(工厂方法)       - 雷蛇键盘
        ```

### Singleton

单例对象能保证在一个 JVM 中，该对象只有一个实例存在。

这样的模式有几个好处： 
1. 某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。 
2. 省去了 new 操作符，降低了系统内存的使用频率，减轻 GC 压力。 
3. 有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了,所以只有使用单例模式，才能保证核心交易服
务器独立控制整个流程。 

```
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

### Builder - 建造者模式，生成器模式
工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，

* Builder类，用来规定产品构建流程
* Director类，用来指挥构建过程完成构建


## 2.结构模式


### Adapter - 适配器模式 
适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。主要分为三类：
1. 接口的适配器模式
    当不希望实现一个接口中所有的方法时,可以创建一个抽象类Adapter,实现借口所有方法(实现为空方法)，我们写别的类的时候，继承抽象类即可。
2. 类的适配器模式
    当希望将一个类转换成满足实现另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。 
3. 对象的适配器模式
    当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Adapter类，持有原类的一个实例，在**Adapter类**的方法中，调用实例的方法就行。 

### Decorator - 装饰器模式
装饰器模式的应用场景： 
1. 需要扩展一个类的功能。 
2. 动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的， 不能动态增删。） 

缺点：产生过多相似的对象，不易排错！

**一个装饰类本身就是目标类型，构造参数接收相同类型实例，类种方法体进行功能功能装饰。**

inputStream -> ...

### Proxy - 代理模式

类似于动态代理

如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
1. 修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
2. 就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
使用代理模式，可以将功能划分的更加清晰，有助于后期维护！

### Facade - 外观模式

构造中控台，起到解耦的作用

http://blog.csdn.net/zhangerqing/article/details/8239539

### Bridge -  桥模式
桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。

桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化。

像我们常用的JDBC桥DriverManager一样，JDBC进行连接数据库的时候，
在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不用动，
原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了。

### Composite - 组合模式

树形组合

### Flyweight - 享元模式

享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。

FlyWeightFactory负责创建和管理享元单元，
当一个客户端请求时，工厂需要检查当前对象池中是否有符合条件的对象，
如果有，就返回已经存在的对象，
如果没有，则创建一个新对象，FlyWeight是超类。

一提到共享池，我们很容易联想到Java里面的JDBC连接池，
想想每个连接的特点，我们不难总结出：

适用于作共享的一些个对象，他们有一些共有的属性，
就拿数据库连接池来说，url、driverClassName、username、password及dbname，
这些属性对于每个连接来说都是一样的，

所以就适合用享元模式来处理，建一个工厂类，将上述类似属性作为内部数据，
其它的作为外部数据，在方法调用时，当做参数传进来，这样就节省了空间，减少了实例的数量。

### strategy - 策略模式
策略模式定义了一系列算法，并将每个算法封装起来，
使他们可以相互替换，且算法的变化不会影响到使用算法的客户。

需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数。

策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。

### Chain of Responsibility - 责任链模式
责任链模式，有多个对象，每个对象持有对下一个对象的引用，
这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求。

但是发出者并不清楚到底最终那个对象会处理该请求，

所以，责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整。

此处强调一点就是，链接上的请求可以是一条链，可以是一个树，还可以是一个环，模式本身不约束这个，需要我们自己去实现，
同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象。



### 备忘录模式
### 中介模式
### 访问模式





[Read More]("http://blog.csdn.net/zhangerqing/article/details/8194653")