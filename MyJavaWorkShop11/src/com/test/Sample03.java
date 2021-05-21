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
	public boolean equals(Object obj) { //equals �޼ҵ� �������̵�
		if(obj !=null && obj instanceof Person) {// ��ü�� �־�� �ϰ� ��ü�� PersonŸ������
			Person p = (Person)obj; 
			return this.id == p.id; //�ڱ� �ڽ� id�� �Ѱ��� id �̾Ƽ� ���ϱ�->true ����
		}else {
			return false;
		}
	}
}
public class Sample03 {
	public static void main(String[] args) {
		Person p = new Person(10);
		Person p2 = new Person(10);
		boolean check = p.equals(p2); //p�� p2�� ���ϱ�
		System.out.println(check);
	}
}
