package myJava0522;

public class VarArgEx {

	static String concatenate(String delim, String...arg) {
		String result ="";
		for(String str: arg) {
			result += str +delim;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String [] strArr = {"100","200","300"};
		System.out.println(concatenate("", "100","200","300"));//100200300
		System.out.println(concatenate("-", strArr));//100-200-300
		System.out.println(concatenate(",", new String[] {"1","2","3"}));//1,2,3,
		System.out.println(concatenate(",", new String[0])); // 출력 없다
	}
}
