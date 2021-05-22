package myJava0522;

class Tv{
	String color;
	boolean power;
	int channel;// 0으로 초기화 된다!
	
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
		System.out.println("현재 채널은"+t1.channel+"입니다.");//6
		Tv t2 = new Tv();
		System.out.println("현재 채널은"+ t2.channel+"입니다.");//0
		
		
		t2 = t1;
		t1.channel = 7;
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}
}
