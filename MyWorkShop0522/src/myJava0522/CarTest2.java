package myJava0522;

class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white","auto",4);// this(): 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다. 
	}
	Car2(String color){
		this(color,"auto",4);
	}
	Car2(String color, String gearType, int door){
		this.color = color; // this: 인스턴스 자신을 가리키는 참조 변수
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println(c1.color+","+c1.gearType+","+c1.door);//white,auto,4
		System.out.println(c2.color+","+c2.gearType+","+c2.door);//blue,auto,4
	}

}
