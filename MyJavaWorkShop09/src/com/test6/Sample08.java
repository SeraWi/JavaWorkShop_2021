package com.test6;
//value type ->Object class�� ��ӹ��� �ʴ´�. 
//reference type -> Object class�� ��ӹ޴´�.


class Employee extends Object{
	public String toString() { // �����ε��� �޼ҵ�
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
		Integer a1 = new Integer(1); //1�� ���۷��� Ÿ������ �ٲٱ� ,Integer�� Ŭ������!
		Float a2 = new Float(1.2); 
		
	}

}
