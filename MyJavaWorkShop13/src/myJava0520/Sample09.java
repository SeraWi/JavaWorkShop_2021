package myJava0520;

import java.util.*;
/*
 * 와일드 카드
 */
abstract class Animal2{
	abstract void breathing();
}
class Dog2 extends Animal2{
	@Override
	void breathing() {
		System.out.println("Dog breathing");
	}
}
class cat2 extends Animal2{
	@Override
	void breathing() {
		System.out.println("Cat breathing");
	}
}

public class Sample09 {
	static void printAnimal(List<? extends Animal2> animals) {
		for(Animal2 o: animals) { 
			o.breathing();
		}
	}
	public static void main(String[] args) {
		ArrayList<Dog2> dog2 = new ArrayList<>();
		dog2.add(new Dog2());
		dog2.add(new Dog2());
		printAnimal(dog2);
		ArrayList<Object> obj = new ArrayList<>();
//		printAnimal(obj);
		
	}
}






