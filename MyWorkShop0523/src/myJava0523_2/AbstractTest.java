package myJava0523_2;

abstract class Player{
	boolean pause;
	int currentPos;//현재 Play되고 있는 위치를 저장하기 위한 변수
	
	Player(){
		pause = false;
		currentPos = 0;
	}
	abstract void play(int pos);
		// 추상메서드 지정된 위치에서 재생을 시작하는 기능이 수행하도록 작성되어야 한다.
	abstract void stop(); // 재생을 즉시 멈추는 기능을 수행하도록 작성
	void play() {
		play(currentPos);
	}
}




public class AbstractTest {

}
