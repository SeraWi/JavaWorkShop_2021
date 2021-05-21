package myJava0521;

import java.util.*;

/*
 * 5�� 21�� �ݿ���
 * Generic + ArrayList
 */

class Animal{
	void breathing() {
		System.out.println("Animal");
	}
}
class Dog extends Animal{
	void breathing() {//�������̵�
		System.out.println("Dog");
	}
}
public class Sample01 {

	static void testMethod( List<? extends Animal> list) { // ?��� �Ϲ�ȭ�ؼ� Object�� �ϸ� Ÿ��ĳ�����ؾ��ϴ� ���������ִ�. 
		for(Animal a: list) {
			a.breathing();
		}
	}
	public static void main(String[] args) {
		testMethod(new ArrayList<Animal>());
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		testMethod(dogs);
		
		List<Animal> animals = new ArrayList<>();
		animals.add(new Dog());
		animals.add(new Animal());
		
	}
}
