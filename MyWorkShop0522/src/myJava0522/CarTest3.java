package myJava0522;
class Car3{
	String color;
	String gearType;
	int door;
	
	Car3(){
		this("white","auto",4);// this(): 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다. 
	}
	
	Car3(String color, String gearType, int door){
		this.color = color; // this: 인스턴스 자신을 가리키는 참조 변수
		this.gearType = gearType;
		this.door = door;
	}
	Car3 (Car3 c){// 인스턴스의 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
		
	}
}
public class CarTest3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		System.out.println(c1.color+","+c1.gearType+","+c1.door);//white,auto,4
		System.out.println(c2.color+","+c2.gearType+","+c2.door);//white,auto,4
		
		c1.door = 100;
		System.out.println(c1.color+","+c1.gearType+","+c1.door);//white,auto,100
		System.out.println(c2.color+","+c2.gearType+","+c2.door);//white,auto,4
		//인스턴스 c2는 c1을 복사하여 생성된 것이므로 서로 같은 상태를 갖지만, 서로 독립적으로 메모리 공간에 존재하는 별도의 인스턴스이므로
		//c1의 값들이 변경되어도 c2는 영향을 받지 않는다. 
		
		
		
	}

}
