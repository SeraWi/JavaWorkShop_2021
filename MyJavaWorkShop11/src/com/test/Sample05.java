package com.test;
/*
 * public String toString();
 */
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
				
	}
	public String toString() {//toString 오버라이딩
		String str = this.name+","+this.age;
		return str;
	}
}
public class Sample05 {

	public static void main(String[] args) {
		Student stu = new Student("Sarah",20);
		System.out.println(stu); //Sarah,20

	}

}
