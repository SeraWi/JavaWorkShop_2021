package myJava0521;

import java.util.*;

/*
 * 5월 21일 금요일
 * Generic + ArrayList
 */

class Animal{
	void breathing() {
		System.out.println("Animal");
	}
}
class Dog extends Animal{
	void breathing() {//오버라이딩
		System.out.println("Dog");
	}
}
public class Sample01 {

	static void testMethod( List<? extends Animal> list) { // ?대신 일반화해서 Object를 하면 타입캐스팅해야하는 불편함이있다. 
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
