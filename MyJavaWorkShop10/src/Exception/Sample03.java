package Exception;
/*
 * ����� ���� ����
 */
class MyException extends Exception{  //���� ���� ����ó��
	MyException(String msg){ // ������
		super(msg);
	}
	
}
public class Sample03 {
//	static void checkMethod(int num) { 
//		if(num % 2 == 0) {
//			throw new ArithmeticException(); //���ܸ� �߻���Ű��
//		}
//	}
	
	static void checkMethod(int num) throws MyException { //���� ó�� ���ѱ��
		if(num % 2 == 0) {
			throw new MyException("¦���Դϴ�."); //���ܸ� �߻���Ű��
		}
	}
	
	public static void main(String[] args) {
//		 checkMethod(1);// ����! ȣ��Ǿ��� �� ���� ó�� �����
//		 checkMethod(2); //
		
		try {
			throw new MyException("���� �����Դϴ�.");//���� �߻���Ű��->try catch ���ֱ�
		} catch (MyException ex) { 
			System.out.println("�����Դϴ�."+ ex.getMessage());
		}//���� �߻���Ű��
		
		
//		 Exception ex = new Exception("�׽�Ʈ�Դϴ�.");//������
//		 try {
//			throw ex;
//		} catch (Exception e) {
//			System.out.println(ex.getMessage());
//		}
	}
}
