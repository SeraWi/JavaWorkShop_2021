package myJava0523_2;

abstract class Player{
	boolean pause;
	int currentPos;//���� Play�ǰ� �ִ� ��ġ�� �����ϱ� ���� ����
	
	Player(){
		pause = false;
		currentPos = 0;
	}
	abstract void play(int pos);
		// �߻�޼��� ������ ��ġ���� ����� �����ϴ� ����� �����ϵ��� �ۼ��Ǿ�� �Ѵ�.
	abstract void stop(); // ����� ��� ���ߴ� ����� �����ϵ��� �ۼ�
	void play() {
		play(currentPos);
	}
}




public class AbstractTest {

}
