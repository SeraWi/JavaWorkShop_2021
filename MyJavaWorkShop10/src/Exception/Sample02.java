package Exception;



/*
 * 5�� 14�� �ݿ���
 * ����ó��
 */

//public class Sample02 {
//	void method1() throws Exception{ //���ܸ� �ѱ��
//		try {
//			int a = 10/0;
//		//throw new Exception(); //���ܸ� �߻���Ű��
//		}catch(Exception ex) {
//
//		}
//	}
//	void method2() {
//		method1();
//	}
//	void method3()  {
//		method2();
//	}
//	public static void main(String[] args) {
//
//		Sample02 obj = new Sample02();
//		obj.method3();
//		System.out.println("EXIT");
//	}
//
//}





public class Sample02 {
	void method1() throws Exception{ //throws = ���� �ѱ��, ���⼭ �� �� �� �ִ�!
		int a = 10/0;
	}
	void method2() throws Exception { //���� �ѱ��
		method1();
	}
	void method3() throws Exception {//���ܳѱ��
		method2();
	}
	public static void main(String[] args) {
		
		
		Sample02 obj = new Sample02();
		try {//���������� ���ο��� ���� ó���ϰ� ��
		obj.method3();
		}catch(Exception ex) {
			System.out.println("EXIT");
		}
		
		
	}

}
