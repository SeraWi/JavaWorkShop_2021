package com.test03;
/*
 * instanceof: 확인!
 */

class A{}
class B extends A {	}
class C extends B{}
class D extends A{}
public class Sample04 {

	public static void main(String[] args) {
		
//		B b = new B();
//		A a = b; //위로 컨버팅 가능
//		
//		B b1 = new B();
//		C c2 = (C)b1; //에러
		
		B b = new B();
		if( b instanceof B) { //true
			System.out.println("B");
		} // B인스턴스 있다
		
		if( b instanceof A) {
			System.out.println("A");
		} // A 인스턴스 있다 , 위에 있는 것도 있다!
		
		if(b instanceof C) {
			System.out.println("C");
		} // C인스턴스 없다.
//		if(b instatnce of D) {
//			System.out.println("D");
//		}
		
	}

}
