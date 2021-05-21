package Exercise;

interface Parseable{
	public static void parse(String fileName) {
		
		
	}
}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println("XML parsing completed");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println("HXML parsing completed");
	}
}

class ParseManager{
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

public class Exercise02 {
	static void parseablep(Parseable p) {
		Parseable.parse(null);
	}
	
	public static void main(String[] args) {
		HTMLParser parser = new HTMLParser();
		parser.parse(null);//HXML parsing completed
		
		XMLParser parser2 = new XMLParser();
		parser2.parse(null); //XML parsing completed
		
		Parseable parser3 = new HTMLParser();
		Parseable.parse(null);//HXML parsing completed
		
		
	}

}
