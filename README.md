# 23种设计方法（Java实现）

每个设计模式已经实现

## 1. 创建模式

### 1.1 单例模式 (single)

定义：保证一个类仅有一个实例，并提供一个访问它的全局访问点。

适用：当类只能有一个实例而且客户可以从一个众所周知的访问点访问它时



### 1.2 原型模式 (prototype)

定义：用原型实例指定创建对象的种类，并且**通过拷贝这些原型创建新的对象**

适用：当要实例化的类是在运行时刻指定时；或者需要创建多个对象并且这些对象内部状态相差不大

#### Demo1

```java
package pattern.prototype.demo1;

import java.util.Date;

public class Video implements Cloneable{

    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Video() {
    }

    public Video(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
```

```java
package pattern.prototype.demo1;

import java.util.Date;

public class Test {
    //有对象Date的问题
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v1 = new Video("hhh",date);
        System.out.println(v1.hashCode());
        System.out.println(v1.toString());
        Video v2 = (Video) v1.clone();
        System.out.println(v2.hashCode());
        System.out.println(v2.toString());
    }
}
```

#### Demo2:

```java
package pattern.prototype.demo2;

import java.util.Date;

public class Video implements Cloneable{

    private String name;
    private Date date;

    //解决Date问题
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        Video v = (Video) object;
        v.date = (Date) this.date.clone();
        return object;
    }

    public Video() {
    }

    public Video(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
```

```java
package pattern.prototype.demo2;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v1 = new Video("hhh",date);
        System.out.println(v1.hashCode());
        System.out.println(v1.toString());
        Video v2 = (Video) v1.clone();
        System.out.println(v2.hashCode());
        System.out.println(v2.toString());
        date.setTime(12345678);
        System.out.println(v1.hashCode());
        System.out.println(v1.toString());
        System.out.println(v2.hashCode());
        System.out.println(v2.toString());
    }
}
```





### 1.3 工厂模式 (factory)

定义：定义一个用于创建对象的接口，让子类决定实例化哪一个类。使一个类的实例化延迟到其子类

适用：当一个类不知道它所必须创建的对象的类的时候



### 1.4 抽象工厂模式 (factory/abstract factory)

定义：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类

适用：一个系统要独立于它的产品的创建、组合和表示时

与工厂模式的区别：**工厂模式的一个工厂接口的子类只能实例化一个产品；抽象工厂能实例多个产品**



### 1.5 构造者模式 (builder)

定义：将一个复杂对象的构建与它的表示分离，使得**同样的构建过程可以创建不同的表示**

适用：当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时

#### Demo1:

```java
package pattern.builder.demo1;

public abstract class Builder {

    abstract void buildA();  //第一步
    abstract void buildB();  //第二步
    abstract void buildC();  //第三步

    abstract Product geProduct();
}
```

```java
package pattern.builder.demo1;
//工作者
public class Worker extends Builder {

    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("1");
    }

    @Override
    void buildB() {
        product.setBuildB("2");
    }

    @Override
    void buildC() {
        product.setBuildC("3");
    }

    @Override
    Product geProduct() {
        return product;
    }
}
```

```java
package pattern.builder.demo1;
//指挥者
public class Director {

    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.geProduct();
    }
}
```

```java
package pattern.builder.demo1;

public class Product{

    private String buildA;
    private String buildB;
    private String buildC;

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                '}';
    }

}

```

```java
package pattern.builder.demo1;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build);
    }
}
```

#### Demo2:

```java
package pattern.builder.demo2;

public abstract class Builder {

    abstract Builder buildA(String a);
    abstract Builder buildB(String a);
    abstract Builder buildC(String b);
    abstract Product build();
}
```

```java
package pattern.builder.demo2;

public class Product {

    private String buildA = "1";
    private String buildB = "2";
    private String buildC = "3";

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                '}';
    }
}
```

```java
package pattern.builder.demo2;

public class Worker extends Builder{

    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    Builder buildA(String a) {
        product.setBuildA(a);
        return this;
    }

    @Override
    Product build() {
        return product;
    }

    @Override
    Builder buildB(String b) {
        product.setBuildB(b);
        return this;
    }

    @Override
    Builder buildC(String c) {
        product.setBuildC(c);
        return this;
    }
}
```

```java
package pattern.builder.demo2;

public class Test {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker
                .buildA("5")
                .buildC("6")
                .build();
        System.out.println(product);
    }
}
```



## 2. 结构模式

### 2.1 适配器模式 (adapter)

定义：将一个类的接口转换成客户希望的另外一个接口，Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

角色：适配器（Adapter）、被适配类、对象（Adaptee）

理解：客户需要Target，现实只有Adaptee，可以用一个实现Target协议的适配器通过类继承或者对象组合类获得被Adaptee。



### 2.2 外观模式 (facade)

定义：为子系统中一组不同的接口提供**统一的接口，一致的界面**。

外观（Facade）模式包含以下主要角色。

1. 外观（Facade）角色：为多个子系统对外提供一个共同的接口。
2. 子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
3. 客户（Client）角色：通过一个外观角色访问各个子系统的功能。



### 2.3 桥接模式 (bridge)

可以将抽象化部分与实现化部分分开，取消二者的继承关系，改用组合关系。

桥接（Bridge）模式包含以下主要角色。

1. 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
2. 扩展抽象化（Refined  Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
3. 实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
4. 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。

```java
package pattern.bridge;

public interface Branch {
    void info();
}
```

```java
package pattern.bridge;

public abstract class Computer {

    private Branch branch;

    public Computer(Branch branch){
        this.branch = branch;
    }

    public void info(){
        branch.info();
    }
}

class Desktop extends Computer{

    public Desktop(Branch branch) {
        super(branch);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}

class Laptop extends Computer{

    public Laptop(Branch branch) {
        super(branch);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}

```

```java
package pattern.bridge;

public class Huawei implements Branch{
    @Override
    public void info() {
        System.out.println("华为");
    }
}
```

```java
package pattern.bridge;

public class Xiaomi implements Branch {
    @Override
    public void info() {
        System.out.println("小米");
    }
}
```

```java
package pattern.bridge;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Laptop(new Huawei());
        computer.info();
    }
}
```



### 2.4 装饰者模式 (decorator)

定义：动态的给对象添加一些额外的功能，就增加功能来说，装饰比生成子类更为灵活。

角色：组件接口（Component）、具体的组件、继承至Component的修饰接口（Decorator）、具体的修饰



### 2.5 代理模式 (proxy)

代理模式的定义：由于某些原因需要给某对象提供一个代理以控制对该对象的访问。这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。 

 角色：客户端（Client）、目标接口（subject）代理对象（Proxy）、真正的目标对象（RealSubject） 

#### 2.5 demo1

```java
package pattern.proxy.demo1;

public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
```

```java
package pattern.proxy.demo1;

public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房");
    }

}
```

```java
package pattern.proxy.demo1;

public class Proxy implements Rent{

    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    public void see(){
        System.out.println("看房");
    }
}
```

```java
package pattern.proxy.demo1;

public interface Rent {

    public void rent();
}
```

#### 2.5 demo2

```java
package pattern.proxy.demo2;

public class Client {
    public static void main(String[] args) {
        UserServiceImp userServiceImp = new UserServiceImp();
        UserProxy userProxy = new UserProxy();
        userProxy.setUserServiceImp(userServiceImp);
        userProxy.add();
    }
}
```

```java
package pattern.proxy.demo2;

public class UserProxy implements UseService{
    private UserServiceImp userServiceImp;

    public void setUserServiceImp(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @Override
    public void add() {
        log("1");
        userServiceImp.add();
    }

    @Override
    public void delete() {
        log("2");
        userServiceImp.delete();
    }

    @Override
    public void update() {
        log("4");
        userServiceImp.update();
    }

    @Override
    public void query() {
        log("3");
        userServiceImp.query();
    }

    public void log(String msg){
        System.out.println(msg);
    }
}
```

```java
package pattern.proxy.demo2;

public class UserServiceImp implements UseService{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void query() {
        System.out.println("query");
    }
}
```

```java
package pattern.proxy.demo2;

public interface UseService {
    void add();
    void delete();
    void update();
    void query();
}
```



### 2.6 组合模式（composite）

组合（Composite）模式的定义：有时又叫作部分-整体模式，它是一种将对象组合成树状的层次结构的模式，用来表示“部分-整体”的关系，使用户对单个对象和组合对象具有一致的访问性。 

组合模式包含以下主要角色。

1. 抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。
2. 树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于实现抽象构件角色中 声明的公共接口。
3. 树枝构件（Composite）角色：是组合中的分支节点对象，它有子节点。它实现了抽象构件角色中声明的接口，它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。



### 2.7 享元模式（Flyweight）

享元（Flyweight）模式的定义：运用共享技术来有効地支持大量细粒度对象的复用。它通过共享已经存在的又橡来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。

1. 抽象享元角色（Flyweight）:是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
2. 具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
3. 非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
4. 享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
  

## 3.  行为模式

 ### 3.1  策略模式 (strategy)

策略（Strategy）模式的定义：该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。

策略模式的主要角色如下。

1. 抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
2. 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
3. 环境（Context）类：持有一个策略类的引用，最终给客户端调用。



### 3.2  模板方法模式 (template)

模板方法（Template Method）模式的定义如下：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。它是一种类行为型模式。 



### 3.3 命令模式 (command)

可以将系统中的相关操作抽象成命令，使调用者与实现者相关分离，其结构如下。

命令模式包含以下主要角色。

1. 抽象命令类（Command）角色：声明执行命令的接口，拥有执行命令的抽象方法 execute()。
2. 具体命令角色（Concrete  Command）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
3. 实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
4. 调用者/请求者（Invoker）角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者。



### 3.4 访问者模式（visitor）

唱歌比赛，成功与否



### 3.5 迭代器模式（iterator）

用一个方法遍历不同类型的集合或数组数据。



### 3.6 观察者模式（observer）

不同公司调用相同的天气公司的接口



### 3.7 中介者模式（mediator）

一个具体类发送命令给中介，中介调用另一个具体类执行



### 3.8 备忘录模式（memento）

备忘录（Memento）模式的定义：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态。该模式又叫快照模式。 

1. 发起人（Originator）角色：保存状态对象。
2. 备忘录（Memento）角色：负责保存好记录，即发起人的内部状态。
3. 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。



### 3.9 解释器模式（interpreter）（难）

解释器（Interpreter）模式的定义：给分析对象定义一个语言，并定义该语言的文法表示，再设计一个解析器来解释语言中的句子。也就是说，用编译语言的方式来分析应用中的实例。这种模式实现了文法表达式处理的接口，该接口解释一个特定的上下文。 



### 3.10 状态模式（state）

状态（State）模式的定义：对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。 



### 3.11 职责链模式 （chain of responsibility）

购买物品，第一个没有权限就轮到下一个人。



