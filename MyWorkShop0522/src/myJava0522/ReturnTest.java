package myJava0522;

public class ReturnTest {
	int add(int a, int b) {
		return a + b;
	}
	void add(int a, int b, int[] result) {
		result[0] = a+b;
	}
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3, 5, result2);// 숫자와 배열을 넣으면
		System.out.println(result2[0]); //배열의 첫번째에 두숫의 합을 저장한다.  

	}

}
