package Exercise;
/*
 * 383.인터페이스
 */
interface Movable{
	void move(int x, int y);
}
interface Attackable{
	void attack(int x, int y);
}

interface Fightable extends Movable, Attackable{} //인터페이스 다중 상속

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
			System.out.println("f는 Unit클래스의 자손입니다.");
		}
		if( f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		}
		if( f instanceof Movable) {
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		}
		if( f instanceof Attackable) {
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		}
		if( f instanceof Object) {
			System.out.println("f는 Object클래스의 자손입니다.");
		}
	}

}





