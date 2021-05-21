package com.test02;
/*
 * Interface
 * 장점: 규격화, 제한, 강제화
 */

interface IStudent{ //상위 인터페이스,객체 만들 수 없다
	//표준적인 요소만 설계, 이름만 들어간다. 
	public void study();
}

class Student implements IStudent{ // 인터페이스 구현,implements
	public void study() {// 오버라이딩 효과
		System.out.println("학생이 공부하다.");
	}
}

public class Sample02 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.study();//학생이 공부한다.
		
		
		IStudent stu2 = new Student(); // Student 객체로 만들고  interface 타입(상위 타입)으로 
		stu.study(); // 구현된다.
		
	}

}
