package Exercise;
/*
 * 383.�������̽�
 */
interface Movable{
	void move(int x, int y);
}
interface Attackable{
	void attack(int x, int y);
}

interface Fightable extends Movable, Attackable{} //�������̽� ���� ���

class Unit{
	int currentHP;
	int x;
	int y;
}
class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {System.out.println("MOVE");}
	public void attack(int x, int y) {System.out.println("ATTACK");}

}

public class Exercise01 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit) {
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}
		if( f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");
		}
		if( f instanceof Movable) {
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");
		}
		if( f instanceof Attackable) {
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		}
		if( f instanceof Object) {
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
		}
	}

}




