package com.Tandemloop;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		while(true)
		{
			System.out.print("Enter the input to create Odd number series:");
			if(sc.hasNextInt())
			{
				a = sc.nextInt();
				if(a > 0)
				{
					break;
				}
				else
				{
					System.out.println("Please! Enter the number greater than 0");
				}
			}
			else
			{
				System.out.println("Please! Enter the valid input: ");
				sc.next();
			}
		}
		
		if(a % 2== 0)
		{
			a = a-1;
		}
		
		System.out.println("Output:");
		
		for(int i = 1; i<= a; i++)
		{
			int oddSeries = 2*i -1;
			System.out.print(oddSeries);
			
			if( i < a)
			{
				System.out.print(", ");
			}
		}
		System.out.println();
		sc.close();

	}

}
