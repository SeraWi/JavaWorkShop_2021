package myJava0522;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	int iv2 =cv;
	
	static int cv2 = new MemberCall().iv;// �ν��Ͻ� ������ ��ü �����ؾ� ��밡��
	
	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv); ����. Ŭ�����޼��忡�� �ν��Ͻ� ������ ���Ұ�
		MemberCall c  = new MemberCall();
		System.out.println(c.iv);// ��ü�� ������ �Ŀ��� �ν��Ͻ������� ��������
	}
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv); // �ν��Ͻ��޼��忡���� �ν��Ͻ� ������ �ٷ� ��밡��
	}
	
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1(); ����. Ŭ�����޼��忡���� �ν��Ͻ��޼��带 ȣ���� �� ����.
		MemberCall c = new MemberCall();
		c.instanceMethod();// �ν��Ͻ��� ������ �Ŀ��� ȣ���� �� �ִ�.
	}
	void instanceMethod2() {//�ν��Ͻ��޼��忡���� �ν��Ͻ��޼���� Ŭ�����޼��� ��� �ν��Ͻ� ���� ���� �ٷ� ȣ�� �����ϴ�. 
		staticMethod1();
		staticMethod2();
		instanceMethod();
	}
	
	
	
	
}
