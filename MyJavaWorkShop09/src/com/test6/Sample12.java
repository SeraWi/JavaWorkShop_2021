package com.test6;

public class Sample12 {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException ex) {
			System.out.println("ArithmaticException");
		}
	}

}
