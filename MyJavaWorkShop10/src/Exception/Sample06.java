package Exception;

class Test extends Exception{
	Test (String msg){
		super(msg);
	}
}

public class Sample06 {

	public static void main(String[] args) throws Exception {
		int a = 0;
		try {
			if(a==0) {
				throw new Exception("오류에요");
			}
		}catch(Test e) {
			System.out.println(e.getMessage());
		}
	}

}
