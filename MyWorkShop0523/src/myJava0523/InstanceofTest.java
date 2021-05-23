package myJava0523;
/*
 * instanceof: 연산의 결과로 boolean값인 true와 false 중의 하나를 반환한다. 
 */
class Car{}
class FireEngine extends Car{}

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("THis is a Object instance");
		}
		System.out.println(fe.getClass().getName());//myJava0523.FireEngine
	}

}
