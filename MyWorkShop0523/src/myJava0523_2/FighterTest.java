package myJava0523_2;

interface Movable{
	void move(int x, int y);
}
interface Attackable{
	void attck(Unit u);
}
class Unit{
	int currentHP; //유닛의 체력
	int x; //유닛의 위치, x좌표
	int y; //유닛의 위치, y좌표
}
interface Fightable extends Movable, Attackable{}
class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attck(Unit u) {
		// TODO Auto-generated method stub
		
	}
	
}
public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		if( f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손입니다. ");
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
			System.out.println("f는 Object클래스의 자손입니다. ");
		}
	}

}
