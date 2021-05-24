package myJava0522;
/*
 * °´Ã¼ ¹è¿­
 */
class Tv2{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
public class Sample02 {

	public static void main(String[] args) {
		Tv2 []tvArr = new Tv2[3];
		
		for(int i = 0; i<tvArr.length; i++) {
			tvArr[i] = new Tv2();
			tvArr[i].channel = i+10;
			System.out.println(tvArr[i].channel);//10,11,12
		}
		for(int i=0; i< tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.println(tvArr[i].channel);//11,12,13
		}
	}
}
