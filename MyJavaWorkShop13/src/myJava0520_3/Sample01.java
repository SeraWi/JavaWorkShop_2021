package myJava0520_3;
/*
 * enums
 */
enum Menu{
	pizza,
	spaghetti,
	raymeon
}
public class Sample01 {
	public static void main(String[] args) {
		System.out.println(Menu.pizza);
		
		for( Menu m: Menu.values()) {
			System.out.println(m);
			System.out.println(m.ordinal()); // 해당되는 숫자가 같이 나온다. 
		}
	}
}

