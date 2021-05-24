package myJava0512;
/*
 * 상속
 * 
 */


public class Sample03 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.barking(); //Dog barking
		dog.breathing(); //Dog breathing
		
		Cat cat  =  new Cat();
		cat.breathing();//Cat breathing
		cat.meowing(); // Cat meowing 
		
		Animal animal = dog;// 하위에서 상위,
		animal.breathing(); // Dog breathing**, 타입은 애니멀이지만 재정의 된 메소드 호출된다.!!!!
		Animal animal2 =cat;
		animal2.breathing(); // cat breathing
		
		checkAnimal(dog); //Dog breathing
		checkAnimal(cat); //Cat breathing
	}
	static void checkAnimal(Animal animal) { //애니멀타입으로 받으면 하위클래스 다 받을 수 있다. 
		//+ 재정의된 메소드 호출된다. 오버라이딩 없으면 상위클래스 메소드 호출된다.
		animal.breathing();
	}

}
