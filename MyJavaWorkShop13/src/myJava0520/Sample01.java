package myJava0520;
/*
 * 5�� 20��
 * �������̽� ����
 * �������̽� ���� ���δ�!-> ǥ��ȭ ��Ű�� ����
 */
interface IStudent{// ��ü ���� �� ����. 
	public void gotoSchool();
}
class Student implements IStudent{/// �������̽� ����
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
		IStudent stu = new Student();// Student��ü , Ÿ���� ����Ÿ������. �������̵� ȿ�� ��Ÿ����.
		stu.gotoSchool();
		//���� ������ ������ ���� �� �ִ�.
		CreateStudent(new Student());// Student��ü�� ����� Ÿ���� �������̽���!
	}
}
