package com.test;
/*
 * public boolean equals
 */
import java.lang.Object;
import java.lang.String;
import java.lang.System;

class Person{
	long id;
	Person(long id){
		this.id = id;
	}
	public boolean equals(Object obj) { //equals 메소드 오버라이딩
		if(obj !=null && obj instanceof Person) {// 객체가 있어야 하고 객체가 Person타입인지
			Person p = (Person)obj; 
			return this.id == p.id; //자기 자신 id와 넘겨준 id 뽑아서 비교하기->true 리턴
		}else {
			return false;
		}
	}
}
public class Sample03 {
	public static void main(String[] args) {
		Person p = new Person(10);
		Person p2 = new Person(10);
		boolean check = p.equals(p2); //p와 p2를 비교하기
		System.out.println(check);
	}
}
