package com.test;

public class Sample01 {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator(new Plus());
		System.out.println(calc.operate(1, 2)); //3
		
		Calculator calc2 = new Calculator(new Minus());
		System.out.println(calc2.operate(1, 2)); //-1
		
//		ICalculator c = new Plus();
//		int ret = c.operate(1,2);
//		System.out.println(ret);//3
		
		
	}

}
