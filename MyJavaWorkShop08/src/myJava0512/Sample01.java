package myJava0512;
/*
 * 5�� 12��
 * ���� �ʱ�ȭ
 */
class MyClass{
	int a; // ��ü ���鶧 ���� ���� ����
	static int b; //0���� �ʱ�ȭ�� ����/, ��� �����ȴ�. 
	static { // �ѹ��� ȣ��ȴ�. 
		b = 10;
		System.out.println(b);
		System.out.println("Static Inital");
	}
	MyClass(){
		a = 200;
		System.out.println(a);
		System.out.println("Default Constructor");
		System.out.println(b++);
	}
}


public class Sample01 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();  //10, Static Inital, 200 ,Default COnstructor - static ����ó�� �ѹ��� ȣ��ȴ�. 
		System.out.println(MyClass.b); // 10
		
		MyClass obj2 =new MyClass(); // 200, Default Constructor,11(b�� �����Ѵ�.)
		
	}
	

}
