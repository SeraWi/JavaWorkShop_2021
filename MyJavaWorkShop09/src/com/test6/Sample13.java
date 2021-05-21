package com.test6;

import java.util.*;

class Student3{
	public void study() {
		System.out.println("Student study");
	}
}

public class Sample13 {

	public static void main(String[] args) {
		Student[] stu = new Student[3];
		stu[0] = new Student();
		//stu[0].study();
		
		List<Student3> stu2 = new ArrayList<Student3>();
		stu2.add(new Student3());
		stu2.get(0).study();
	}

}
