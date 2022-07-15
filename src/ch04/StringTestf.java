package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {
	public static void main(String[] args) throws ClassNotFoundException{
		//Class를 이용한 동적바인딩
		Class c = Class.forName("java.lang.String");
		
		Constructor[] cons = c.getConstructors();
		for(Constructor co : cons) {
			System.out.println(co);;
		}
		
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth);
		}
	}
}
