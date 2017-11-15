# Important-JAVA-Design-Patterns
This repository is to give overview on important Java design patterns with example code

<h1>Creational Design patterns</h1>
Creational design patterns deal with creating objects in a efficient way so that program gives best performance by utilising minimal resources.

<b>1. Singleton Design pattern</b></br>

Singleton is a software creational design pattern which is used to maintain one instance of a class per JVM at any point of time. 
Here are the few use cases for singleton design pattern
1. Create connection objects like DB
2. Create config objects which holds config data
3. Create logging objects which can be used to write logs
4. Create Caching objects

<b>2. Factory Design pattern</b>

Factory design pattern is also one of the best way of creating objects when multiple classes implement same interface. This pattern leaves resoponsibility of creating objects to factory method based on the scenario.

use cases for factory design pattern
1. Makes programs loosly coupled
2. Client program doesn't require any changes when implementation classes changes
3. Factory pattern provides abstraction between client and implementation classes

