package myJava0523_3;

public class ExceptionEx13 {
	static void method1() {
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1�޼ҵ忡�� ���� ó���� �Ǿ����ϴ�. ");
		}
	}
	public static void main(String[] args) {
		method1();// ���� Ŭ����, static�Լ�, ��ü �������� ���� ȣ�Ⱑ��
	}

}
