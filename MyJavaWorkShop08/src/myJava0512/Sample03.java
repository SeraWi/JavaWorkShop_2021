package myJava0512;
/*
 * ���
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
		
		Animal animal = dog;// �������� ����,
		animal.breathing(); // Dog breathing**, Ÿ���� �ִϸ������� ������ �� �޼ҵ� ȣ��ȴ�.!!!!
		Animal animal2 =cat;
		animal2.breathing(); // cat breathing
		
		checkAnimal(dog); //Dog breathing
		checkAnimal(cat); //Cat breathing
	}
	static void checkAnimal(Animal animal) { //�ִϸ�Ÿ������ ������ ����Ŭ���� �� ���� �� �ִ�. 
		//+ �����ǵ� �޼ҵ� ȣ��ȴ�. �������̵� ������ ����Ŭ���� �޼ҵ� ȣ��ȴ�.
		animal.breathing();
	}

}
