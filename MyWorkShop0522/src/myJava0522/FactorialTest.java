package myJava0522;

public class FactorialTest {
	static int factorial(int n) {
		int result =0;
		if(n ==1) {
			result =1;
		}else {
			result = n*factorial(n-1);// 다시 메서드 자신을 호출한다. 
		}
		return result;
	}
	
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);

	}

}
