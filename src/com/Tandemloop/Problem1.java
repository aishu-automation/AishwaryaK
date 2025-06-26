package com.Tandemloop;

import java.util.Scanner;

public class Problem1 {
	
	public static double add(double a,double b)
	{
		return a + b;
	}
	
	public static double subtract(double a, double b)
	{
		return  a - b;
	}
	
	public static double multiply(double a, double b)
	{
		return a * b;
	}
	
	public static double divide(double a, double b)
	{
		if(b == 0)
		{
			System.out.println("Cannot divide by zero");
			return Double.NaN;
		}
		return a / b;
	}
	
	public static double calculator(double a, double b, String opeartion)
	{
		switch(opeartion.toLowerCase())
		{
		case "add":
			return add(a,b);
		case "subtract":
			return subtract(a,b);
		case "multiply":
			return multiply(a,b);
		case "divide":
			return divide(a,b);
		default:
			return 0;
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double a = 0, b= 0;
		String type_Of_Operation = null;
		
		while(true)
		{
			
			System.out.print("Enter input for a:");
			if(sc.hasNextDouble())
			{
				a = sc.nextDouble();
				sc.nextLine();
				break;
			}
			else
			{
				System.out.println("Please! Enter the valid input:");
				sc.nextLine();
			}
		}
		
		while(true)
		{
			System.out.print("Enter input for b:");
			if(sc.hasNextDouble())
			{
				b = sc.nextDouble();
				sc.nextLine();
				break;
			}
			else
			{
				System.out.println("Please! Enter the valid input:");
				sc.nextLine();
			}
		}
		
		while(true)
		{
			System.out.println("Enter type of operation like 'add','subtract','multiply','divide':");
			type_Of_Operation = sc.nextLine().trim().toLowerCase();
			if (type_Of_Operation.equals("add") || type_Of_Operation.equals("subtract")
					|| type_Of_Operation.equals("multiply") || type_Of_Operation.equals("divide")) 
			{
				break;
			} else {
				System.out.println("Invalid operation! Please enter one of: add, subtract, multiply, divide.");
			}
		}
		double result = calculator(a, b, type_Of_Operation);
		if (!Double.isNaN(result)) {
			System.out.println("Result: " + result);
		}
		sc.close();

	}

}

