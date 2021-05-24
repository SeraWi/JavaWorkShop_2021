package myJava0522;

public class ReferenceParamEx2 {

	static void change(int[] x) {
		x[0] = 1000;
		System.out.println(x[0]);
	}
	public static void main(String[] args) {
		int[] x = {10};
		System.out.println(x[0]);//10
		
		change(x);//1000
		System.out.println(x[0]);//1000
	}
}
