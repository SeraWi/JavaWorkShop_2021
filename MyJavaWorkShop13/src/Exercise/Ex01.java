package Exercise;

import java.util.*;


interface Eatable{}
class Fruit implements Eatable{
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}
class Toy{
	public String toString() {
		return "Toy";
	}
}
class Box<T>{
	ArrayList <T> list  = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}
class FruitBox<T extends Fruit & Eatable> extends Box<T>{
	
}

public class Ex01 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitbox = new FruitBox<>();
		FruitBox<Apple> applebox = new FruitBox<>();
		FruitBox<Grape> grapebox = new FruitBox<>();
		//FruitBox<Toy> toybox = new FruitBox<>();
		Box <Toy> toybox = new Box<>();
		
		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());
		
		applebox.add(new Apple());
		grapebox.add(new Grape());
		toybox.add(new Toy());
		
		
		System.out.println("fruitbox -"+fruitbox);
		System.out.println("applebox -"+applebox);
		System.out.println("grapebox -"+grapebox);
		System.out.println("toybox -"+toybox);
	}
}








