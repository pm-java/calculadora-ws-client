package com.main;

import com.example.Calculator;
import com.example.CalculatorService;

public class ClaseMain {
	
	public static void main(String [] args) {
		
		
		Calculator calculadora = new CalculatorService().getCalculatorPort();
		
		System.out.println(calculadora.add(86, 9));
		
		
		
	}

}
