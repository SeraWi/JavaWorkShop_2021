package framework;

import java.util.*;

class Animal{
	void breathing() {
		System.out.println("animal breathing");
	}
}
class Dog extends Animal{
	void breathing() {
		System.out.println("Dog breathing");
	}
}

public class Sample03 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Animal());
		al.add(new Dog());
		
		for(int inx = 0;inx<al.size(); inx++) {
			Object obj = al.get(inx);
			Animal a =(Animal) obj;
//			Dog a = (Dog)obj;
			a.breathing();
			
		}
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			Animal a = (Animal)obj;// Object o = new Dog();->Animal로 타입 바꾸기->오버라이딩 한 메소드 호출된다.
			itr.next();
		}
		
	}
}
