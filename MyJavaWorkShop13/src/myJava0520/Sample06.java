package myJava0520;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Fish {}
class Manager<T extends Animal> {// Animal�� ��ӹ��� Ŭ������
	T animal;
	Manager(T animal){
		this.animal = animal;
	}
	public T getObjct() {
		return this.animal;
	}
}

public class Sample06 {
	public static void main(String[] args) {
		Manager <Dog> dog = new Manager<>(new Dog());
		//Manager <Fish> fish = new Manager<>(new Fish()); Animal����� �ƴ� Fish�� ������ ����
		Manager <Cat> cat = new Manager<>(new Cat());
		
		
	}
}
