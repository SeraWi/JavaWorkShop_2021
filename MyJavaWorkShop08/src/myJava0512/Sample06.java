package myJava0512;
/*
 * super의 의미
 * 
 */
class Student{
	protected String name;
	protected int age;
	Student(){} // default constructor 선언
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
}
class MiddleStudent extends Student{
	String gender;
	MiddleStudent(String name, int age, String gender){
		super(name,age); // Student 호출한다. 첫번째 라인에 써줘야 한다. 
		this.gender = gender;
		System.out.println(this.name + ","+this.age+","+this.gender );
				
	}
}

public class Sample06 {

	public static void main(String[] args) {
		
		MiddleStudent middle = new MiddleStudent("홍길동",20,"남");//홍길동,20,남
		
		
		
	}

}
