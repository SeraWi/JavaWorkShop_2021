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
class CaptionTv extends Tv{//���
	boolean caption;
	void displayCaption(String test) {
		if(caption) { // ĸ�� ���°� on(true)�� ���� text�� �����ش�.
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
		ctv.caption = true;// ĸ�Ǳ�� �ѱ�
		ctv.displayCaption("Hello World");
	}

}
