package myJava0523_3;

public class ExceptionEx9 {

	public static void main(String[] args) {
		try {
		throw new Exception("���Ƿ� �߻�������.");
		}catch(Exception e) {
			System.out.println("�����޽���:"+ e.getMessage());
		}
		System.out.println("���α׷��� ���� ����Ǿ���");
	}
}
