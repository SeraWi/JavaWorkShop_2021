package com.test6;

public class Sample09 {

	public static void main(String[] args) {
		try {
			int a  = 1/0;
		}catch(Exception ex) {//Exception�� ���� ���� Ÿ���̴�! 
			System.out.println("������ �߻��Ͽ����� �����ڿ��� �������ּ���.");
		}
		
		try {
			int a  = 1/0;
		}catch(OutOfMemoryError ex) {//���ܿ� �´� ��Ȯ�� ��Ī ����, �������� ���������� 
			System.out.println("OutOfMemoryError ������ �߻��Ͽ����� �����ڿ��� �������ּ���.");
		}catch(ArithmeticException ex) {
			String name = ex.getMessage();
			System.out.println(name);
			System.out.println("ArithmeticException ������ �߻��Ͽ����ϴ�.");
		}catch(Exception ex) { //���� �������� ����Ÿ�� ����ó��
			System.out.println("Exception ������ �߻��Ͽ����ϴ�.");
		}
		System.out.println("�����մϴ�.");
		
	}

}
