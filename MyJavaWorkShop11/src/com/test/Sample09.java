package com.test;
/*
 * ���� Ŭ����
 */
public class Sample09 {
	public static void main(String[] args) {
		// value -> referenceŸ������ �ٲٱ�, boxing
		int a = 10;
		Integer i = Integer.valueOf(a);
		Object o = i; 
		System.out.println(i.toString()+","+i); //10,10
		
		Integer i2 = new Integer(100);
		System.out.println(i2.toString()+","+i2);
		
		//unboxing(reference -> value)
		
		int c = i.intValue();
		System.out.println(c);
		
		
	}
}
