package com.test;

class CustomWrapperType{
	private int i ;
	CustomWrapperType(int i){
		this.i = i;
	}
	public int getValue() {
		return this.i;
	}
	public void setValue(int i) {
		this.i = i;
	}
	public String toString() {
		return Integer.toString(i);
	}
}

public class Sample10 {

	public static void main(String[] args) {
		CustomWrapperType c = new CustomWrapperType(10);
		System.out.println(c);
		
		int a = 10;
		Object b = a; // 레퍼런스 타입으로 자동 바뀜
		int c2 = (int)b; //다시 int로 언박싱
		System.out.println(a);
		System.out.println(c2);
	}

}
