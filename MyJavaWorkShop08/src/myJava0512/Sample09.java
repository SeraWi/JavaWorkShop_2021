package myJava0512;
/*
 * abstract : �ǹ�: �ҿ����ϴ� ->��üȭ ��ų �� ����.
 */
abstract class Student3{
	void studying() {
		System.out.println("Student3 study");
	}
	abstract void eating();
}
class Student4 extends Student3{
	public void eating() {// �������̵�
		System.out.println("Student4 eating");
	}
}


public class Sample09 {

	public static void main(String[] args) {
		// Student3 s = new Student3(); class�� abstract�� ��ü ����� ����. 
		Student4 s = new Student4(); // ��üȭ ����
		s.eating(); //Student4 eating
		s.studying(); //Student3 study
	}

}
