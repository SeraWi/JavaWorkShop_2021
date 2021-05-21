package myJava0520;

import java.util.*;

class A{
}
class B extends A{
}

public class Sample10 { 
	// test1+ test2 -> test => test3(최종단계!),test4
	static void test(Object o) {} //
	static void test1(A a) {}
	static void test2(B b) {}
	
	static <T extends Object> void test3(T o) { // 캐스팅 할 필요 없다.
	}
	static void test4(ArrayList<?> a) {}
	
	public static void main(String[] args) {
	}
}
