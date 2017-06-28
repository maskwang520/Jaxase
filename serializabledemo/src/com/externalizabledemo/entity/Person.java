package com.externalizabledemo.entity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.serilizeabledemo.entity.Gender;
/**
 * JDK���ṩ����һ�����л��ӿ�--Externalizable��
 * ʹ�øýӿ�֮��֮ǰ����Serializable�ӿڵ����л����ƾͽ�ʧЧ
 * @author maskwang
 *
 */
public class Person implements Externalizable {
	private String name;
	private int age;
	Gender gender;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Person(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
    
	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	//����������������������û�õ�
	private void writeObject(ObjectOutputStream out) throws IOException {  
        out.defaultWriteObject();  
        out.writeInt(age);  
    }  
 
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {  
        in.defaultReadObject();  
        age = in.readInt();  
    }  

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(age);
		out.writeObject(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		age=in.readInt();
		name=(String) in.readObject();
		
	}

}