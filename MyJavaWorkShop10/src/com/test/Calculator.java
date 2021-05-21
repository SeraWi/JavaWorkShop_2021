package com.test;

public class Calculator {
	ICalculator calc;
	Calculator(ICalculator calc ){ //plus와 minus상위 타입으로 받기
		this.calc = calc;
		
	}
	public int operate(int a, int b) {
		return this.calc.operate(a, b);
	}
}
