package Exercise;

public class Exercise04 {	
	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻�������");
			throw e;
		}catch(Exception e){
			System.out.println("�����޽���:"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���");
	}
	
	
	
}// end class
//	public static void main(String[] args) {
//		int number =100;
//		int result = 0;
//		
//			for(int i =0; i<10;i++) {
//				try {
//				result = number/ (int)(Math.random()*10);
//			}catch(ArithmeticException ex) {
//				System.out.println("����");
//			}
//		}
//	
//	}
//
//}





//	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(0/0);
//			System.out.println(4);
//		}catch(ArithmeticException ex) {
//			System.out.println(5);
//		}
//		System.out.println(6);
//	}
//}
