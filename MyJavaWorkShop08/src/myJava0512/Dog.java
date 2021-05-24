package myJava0512;

public class Dog extends Animal {
	void barking() {
		System.out.println("Dog barking");
	}
	void breathing() { // 재정의, 오버라이딩, 이름이 같아야 한다. 
		System.out.println("Dog breathing");
	}
}
