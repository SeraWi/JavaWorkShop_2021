package myJava0522;

class Tv{
	String color;
	boolean power;
	int channel;// 0���� �ʱ�ȭ �ȴ�!
	
	void power() {
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

public class Sample01 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		t1.channel = 7;
		t1.channelDown();
		System.out.println("���� ä����"+t1.channel+"�Դϴ�.");//6
		Tv t2 = new Tv();
		System.out.println("���� ä����"+ t2.channel+"�Դϴ�.");//0
		
		
		t2 = t1;
		t1.channel = 7;
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}
}
