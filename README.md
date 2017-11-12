# Important-JAVA-Design-Patterns
This repository is to give overview on important Java design patterns with example code

<b>Singleton Design pattern</b>
Singleton is a software design pattern which is used to maintain one instance of a class per JVM at any point of time. 
Here are the few use cases for singleton design pattern
1. Create connection objects like DB
2. Create config objects which holds config data
3. Create logging objects which can be used to write logs
4. Create Caching objects

//singleton class
public class SingletonClass{
	private static volatile SingletonClass instance = null;
	private SingletonClass(){
		System.out.println("Instance created");
	}
	public static SingletonClass getInstance(){
		if(instance == null){
			synchronized(SingletonClass.class){
				if(instance == null)
					instance = new SingletonClass();
			}
		}
			return instance;
	}
	
}
