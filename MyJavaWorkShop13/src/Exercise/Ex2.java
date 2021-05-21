package Exercise;

import java.util.*;



class Fruit2{ 
	String name;
	int weight;
	
	Fruit2 (String name, int weight){//积己磊
		this.name = name;
		this.weight = weight;
	}
	public String toString() {
		return name+"("+ weight+")";
	}
}
class Apple2 extends Fruit2{//惑加
	Apple2(String name, int weight){
		super(name,weight); 
	}
}
class Grape2 extends Fruit2{//惑加
	Grape2(String name, int weight){
		super(name,weight);
	}
}

class Box2<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	ArrayList<T> getList(){
		return list;
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}
class FruitBox2<T extends Fruit2> extends Box2<T>{
	
}
class AppleComp implements Comparator<Apple2>{

	@Override
	public int compare(Apple2 t1, Apple2 t2) {
		return t2.weight -t1.weight;
	}
}
class GrapeComp implements Comparator<Grape2>{

	@Override
	public int compare(Grape2 t1, Grape2 t2) {
		return t2.weight -t1.weight;
	}
}
class FruitComp implements Comparator<Fruit2>{
	@Override
	public int compare(Fruit2 t1, Fruit2 t2) {
		return t1.weight -t2.weight;
	}
}
public class Ex2 {

	public static void main(String[] args) {
		FruitBox2<Apple2> applebox = new FruitBox2<Apple2>();
		FruitBox2<Grape2> grapebox = new FruitBox2<Grape2>();
		
		applebox.add(new Apple2("GreenApple",300));
		applebox.add(new Apple2("GreenApple",100));
		applebox.add(new Apple2("GreenApple",200));
		
		grapebox.add(new Grape2("GreenGrape",400));
		grapebox.add(new Grape2("GreenGrape",300));
		grapebox.add(new Grape2("GreenGrape",200));
		
		Collections.sort(applebox.getList(), new AppleComp());
		Collections.sort(grapebox.getList(), new GrapeComp());
		System.out.println(applebox);
		System.out.println(grapebox);
		System.out.println();
		
		Collections.sort(applebox.getList(), new FruitComp());
		Collections.sort(grapebox.getList(), new FruitComp());
		System.out.println(applebox);
		System.out.println(grapebox);
		
	}

}









