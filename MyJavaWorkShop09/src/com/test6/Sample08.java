package com.test6;
//value type ->Object class를 상속받지 않는다. 
//reference type -> Object class를 상속받는다.


class Employee extends Object{
	public String toString() { // 오버로딩된 메소드
		Integer i = new Integer(this.hashCode());
		return i.toString();
		//return "Employee Class";
	}
}

public class Sample08 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		String temp = emp.toString();
		System.out.println(temp); //Employee Class
		System.out.println(emp); //Employee Class
		Employee emp2 = new Employee();
		System.out.println(emp2);
		
		int a = 1; //value type
		Integer a1 = new Integer(1); //1을 레퍼런스 타입으로 바꾸기 ,Integer는 클래스임!
		Float a2 = new Float(1.2); 
		
	}

}
