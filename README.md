There are two different types of classes.They are-
1. Abstract class : Abstract class is a restricted class that cannot be used to create objects to access it, it must be inherited from another class.Abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).Remember that,We must use abstract keyword at the start of that class or method.
Example : Here Shop class is the abstract class.And todaySell(),todayDue() is the abstract method.
   
2. Concrete class : A concrete class is a class that has an implementation for all of its methods. They cannot have any unimplemented methods. It can also extend an abstract class or implement an interface as long as it implements all their methods. It is a complete class and can be instantiated.
Example : Here Shopkeeper class and Owner class is the concrete class.

There are two types of relationship between classes.One is Has-a relationship and another is Is-a relationship.
1. Has-a relationship : Whenever an instance of one class is used in another class, it is called HAS-A relationship.
Example : In Owner class we can see there is an instance of Shopkeeper class.So,there is Has-a relationship between them.
2. Is-a relationship : Whenever one class inherits another class, it is called an IS-A relationship.
Example : Here,Shopkeeper class inherits the Shop class.So,there is Is-a relationship between them.

### Some important keyword

final : The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override). The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...). The final keyword is called a "modifier".
this : The this keyword refers to the current object in a method or constructor. The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name because a class attribute is shadowed by a method or constructor parameter.
