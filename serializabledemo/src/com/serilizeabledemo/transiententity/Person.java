package com.serilizeabledemo.transiententity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.serilizeabledemo.entity.Gender;

public class Person implements Serializable {
	transient int age;
	String name;
	Gender gender;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Person(int age, String name, Gender gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	//此时可以通过下面两个方法，把age单独序列化和反序列
	//顺序还是先调用默认的序列化方式，再把age写进去。
	//务必遵从方法签名一样。
	private void writeObject(ObjectOutputStream out) throws IOException {  
        out.defaultWriteObject();  
        out.writeInt(age);  
    }  
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {  
	        in.defaultReadObject();  
	        age = in.readInt();  
	    }  
	
}
