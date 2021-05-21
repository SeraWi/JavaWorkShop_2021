package myJava0518;
/*
 * 익명 클래스
 */

abstract class Student{
	abstract void studying();
}


public class Sample08 {

	public static void main(String[] args) {
		Object o  = new Object() {
			void testMethod() {
				System.out.println("testMethod");
			}
		};

		Student stu = new Student() {//한방에 만들기, 한번만 쓰기 때문에 여기에 한번에 쓰고 말기 위해!
			void studying() {// 추상클래스 여기서 구현
				System.out.println("Student studying");
			}
		};
		stu.studying();


	}


}


