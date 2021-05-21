package Exercise;
class Card{
	String kind;
	int number;
	
	Card(){
		this("Spade",1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		return "kind:"+kind+",name:"+number;
	}
}

public class Exercise01 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);//true
		System.out.println(str1.equals(str2));//true
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3.equals(str4)); //true
		System.out.println(str3 == str4); //false
		
		Card c1 =new Card();
		Card c2 = new Card("Heart",10);
		System.out.println(c1);//kind:Spade,name:1
		System.out.println(c2);//kind:Heart,name:10
	}
}
