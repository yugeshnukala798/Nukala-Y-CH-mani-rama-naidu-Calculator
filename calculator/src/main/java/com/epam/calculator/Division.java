package com.epam.calculator;

public class Division {
	
	double a,b;
	Division(double a,double b) {
		this.a = a;
		this.b = b;
		
	}
	void divide() {
		try {
			if(this.b == 0) {
				throw new ArithmeticException();
			}
			else {
				System.out.println(this.a / this.b);
			}
		}
		catch(ArithmeticException exp) {
			System.out.println("Second number must not be zero.");
		}
	}

}
