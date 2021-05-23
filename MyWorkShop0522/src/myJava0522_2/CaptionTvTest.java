package myJava0522_2;
class Tv{
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
class CaptionTv extends Tv{//상속
	boolean caption;
	void displayCaption(String test) {
		if(caption) { // 캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(test);
		}
	}
}
public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);//11
		ctv.displayCaption("Hello World");
		ctv.caption = true;// 캡션기능 켜기
		ctv.displayCaption("Hello World");
	}

}
