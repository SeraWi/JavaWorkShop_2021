package myJava0522;
class Car3{
	String color;
	String gearType;
	int door;
	
	Car3(){
		this("white","auto",4);// this(): ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�. 
	}
	
	Car3(String color, String gearType, int door){
		this.color = color; // this: �ν��Ͻ� �ڽ��� ����Ű�� ���� ����
		this.gearType = gearType;
		this.door = door;
	}
	Car3 (Car3 c){// �ν��Ͻ��� ���縦 ���� ������
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
		//�ν��Ͻ� c2�� c1�� �����Ͽ� ������ ���̹Ƿ� ���� ���� ���¸� ������, ���� ���������� �޸� ������ �����ϴ� ������ �ν��Ͻ��̹Ƿ�
		//c1�� ������ ����Ǿ c2�� ������ ���� �ʴ´�. 
		
		
		
	}

}
