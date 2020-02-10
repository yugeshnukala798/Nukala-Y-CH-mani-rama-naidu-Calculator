package com.epam.calculator;

import java.util.*;
public class Calculator {

    public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);
        System.out.println("***** Calculator *****");
        System.out.println();
    	double a = 0.0,b = 0.0;
        while(true) {
        	System.out.print("Select an Option : "+"\n"+"1. Addition"+"\n"+"2. Substraction"+"\n"+"3. Multiplication"+"\n"+"4. Division"+"\n"+"5. Exit"+"\n");
        	int option = in.nextInt();
        	switch(option) {
        		case 1 :
        			System.out.println("Enter first number to add : ");
        			a = in.nextDouble();
        			System.out.println("Enter second number to add : ");
        			b = in.nextDouble();
        			Addition ad = new Addition(a,b);
        			ad.add();
        			break;
        		case 2 :
        			System.out.println("Enter first number : ");
        			a = in.nextDouble();
        			System.out.println("Enter second number : ");
        			b = in.nextDouble();
        			Substraction su = new Substraction(a,b);
        			su.substract();
        			break;
        		case 3 :
        			System.out.println("Enter first number : ");
        			a = in.nextDouble();
        			System.out.println("Enter second number : ");
        			b = in.nextDouble();
        			Multiplication mul = new Multiplication(a , b);
        			mul.multiply();
        			break;
        		case 4 :
        			System.out.println("Enter first number : ");
        			a = in.nextDouble();
        			System.out.println("Enter second number : ");
        			b = in.nextDouble();
        			Division div = new Division(a , b);
        			div.divide();
        			break;
        			
        		case 5:
        			in.close();
        			return ;
        		default:
        			System.out.println("Enter valid option");
        	}
        }
    }

}
