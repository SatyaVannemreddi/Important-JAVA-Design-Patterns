package com.satya;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

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
 class TestClass {

	public static void main(String[] args) throws Exception{
		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance();
		
		// System should pring same hashcode
		display("instance1", instance1);
		display("instance2", instance2);
		
		//Reflection
//		Class stclass = Class.forName("com.satya.SingletonClass");
//		Constructor<SingletonClass> cons = stclass.getDeclaredConstructor();
//		cons.setAccessible(true);
//		SingletonClass instance3 = cons.newInstance();
//		display("instance3", instance3);
		
		//Serialization/deserialization
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/ser1.ser"));
//		oos.writeObject(instance2);
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/ser1.ser"));
//		SingletonClass instance4 = (SingletonClass)ois.readObject();
//		
//		display("instance4",instance4);
		
		//cloning
//		SingletonClass instance5 = (SingletonClass)instance2.clone();
//		display("instance5", instance5);
		
	}
	
	 static void display(String name, SingletonClass obj){
		System.out.println(String.format("Instance: %s, hashCode: %d",name, obj.hashCode()));
	}

}