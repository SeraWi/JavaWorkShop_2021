package com.test03;
/*
 * instanceof: Ȯ��!
 */

class A{}
class B extends A {	}
class C extends B{}
class D extends A{}
public class Sample04 {

	public static void main(String[] args) {
		
//		B b = new B();
//		A a = b; //���� ������ ����
//		
//		B b1 = new B();
//		C c2 = (C)b1; //����
		
		B b = new B();
		if( b instanceof B) { //true
			System.out.println("B");
		} // B�ν��Ͻ� �ִ�
		
		if( b instanceof A) {
			System.out.println("A");
		} // A �ν��Ͻ� �ִ� , ���� �ִ� �͵� �ִ�!
		
		if(b instanceof C) {
			System.out.println("C");
		} // C�ν��Ͻ� ����.
//		if(b instatnce of D) {
//			System.out.println("D");
//		}
		
	}

}
