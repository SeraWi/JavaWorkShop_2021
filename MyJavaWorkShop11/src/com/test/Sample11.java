package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample11 {

	public static void main(String[] args) {

		String[] data = {"bat","batman","bonus"};
		Pattern p = Pattern.compile("[a-z0-9][a-z]");

		for(String s: data) {
			Matcher  m = p.matcher(s);
			if(m.matches()) {System.out.println(s);}

		}
	}
}		

//		String [] data = {"bat","baby","bonus","cA","ca","co","c.","c0","car","combat","count","date","disc"};
//		Pattern p = Pattern.compile("c[a-z]*");
//		
//		for (int i = 0; i<data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i]+",");
//		}
//		
//		
//	}


