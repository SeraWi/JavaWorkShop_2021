package myJava0520;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Fish {}
class Manager<T extends Animal> {// Animal과 상속받은 클래스만
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
		//Manager <Fish> fish = new Manager<>(new Fish()); Animal상속이 아닌 Fish가 들어오면 에러
		Manager <Cat> cat = new Manager<>(new Cat());
		
		
	}
}
