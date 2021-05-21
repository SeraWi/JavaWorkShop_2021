package com.test;

import java.lang.reflect.Method;

/*
 * getClass()// 패키지 이름과 클래스 이름 알수 있다
 * getSimpleName() //클래스 이름
 * getMethods()
 * 
 */
class MyClass{
	String name;
	void myMethod(){
		
	}
}
public class Sample06 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		Class  c = obj.getClass();
		System.out.println(c.getName()+","+c.getSimpleName());//com.test.MyClass  , MyClass
		Method[] methods = c.getMethods(); //메소드 목록 출력
		for(int inx = 0; inx< methods.length; inx++) {
			System.out.println(methods[inx].getName());
		}
	}

}
