package myJava0512;
/*
 * super�� �ǹ�
 * 
 */
class Student{
	protected String name;
	protected int age;
	Student(){} // default constructor ����
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
}
class MiddleStudent extends Student{
	String gender;
	MiddleStudent(String name, int age, String gender){
		super(name,age); // Student ȣ���Ѵ�. ù��° ���ο� ����� �Ѵ�. 
		this.gender = gender;
		System.out.println(this.name + ","+this.age+","+this.gender );
				
	}
}

public class Sample06 {

	public static void main(String[] args) {
		
		MiddleStudent middle = new MiddleStudent("ȫ�浿",20,"��");//ȫ�浿,20,��
		
		
		
	}

}
