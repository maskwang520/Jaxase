package com.serilizeabledemo.transiententity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.serilizeabledemo.entity.Gender;
/**
 * 当字段为transient时候，是不会被序列化的。
 * 重写了writeObject()和readObject后就可以
 * @author maskwang
 *
 */

public class TransientTest {
	@Test
	public void transientest() throws Throwable, IOException {
		File file = new File("p1.dat");
		Person p = new Person(10, "maskwang", Gender.Male);
		// ObjectOutputStream是包装流
		ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(file));
		outStream.writeObject(p);
		ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(file));
		Object p1 = inStream.readObject();
		System.out.println(p1);//此时age为0，默认的。说明并没有序列化
	}
}
