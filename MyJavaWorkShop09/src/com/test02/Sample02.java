package com.test02;
/*
 * Interface
 * ����: �԰�ȭ, ����, ����ȭ
 */

interface IStudent{ //���� �������̽�,��ü ���� �� ����
	//ǥ������ ��Ҹ� ����, �̸��� ����. 
	public void study();
}

class Student implements IStudent{ // �������̽� ����,implements
	public void study() {// �������̵� ȿ��
		System.out.println("�л��� �����ϴ�.");
	}
}

public class Sample02 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.study();//�л��� �����Ѵ�.
		
		
		IStudent stu2 = new Student(); // Student ��ü�� �����  interface Ÿ��(���� Ÿ��)���� 
		stu.study(); // �����ȴ�.
		
	}

}
