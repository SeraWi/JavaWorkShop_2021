package myJava0520;
/*
 * 5월 20일
 * 인터페이스 복습
 * 인터페이스 많이 쓰인다!-> 표준화 시키기 위해
 */
interface IStudent{// 객체 만들 수 없다. 
	public void gotoSchool();
}
class Student implements IStudent{/// 인터페이스 구현
	@Override
	public void gotoSchool() {
		System.out.println("Student gotoSchool");
	}
}

public class Sample01 {
	static void CreateStudent(IStudent stu) {
		stu.gotoSchool();
	}
	
	public static void main(String[] args) {
		IStudent stu = new Student();// Student객체 , 타입은 상위타입으로. 오버라이딩 효과 나타나나.
		stu.gotoSchool();
		//위에 두줄을 밑으로 줄일 수 있다.
		CreateStudent(new Student());// Student객체를 만들고 타입은 인터페이스로!
	}
}
