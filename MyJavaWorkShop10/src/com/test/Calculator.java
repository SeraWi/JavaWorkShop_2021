package com.test;

public class Calculator {
	ICalculator calc;
	Calculator(ICalculator calc ){ //plus�� minus���� Ÿ������ �ޱ�
		this.calc = calc;
		
	}
	public int operate(int a, int b) {
		return this.calc.operate(a, b);
	}
}
