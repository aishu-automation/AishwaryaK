package com.Tandemloop;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		
		int arrNumber[] = {1,2,8,9,12,46,76,82,15,20,30};
		
		Map<Integer,Integer> numberCountMap = new LinkedHashMap<Integer,Integer>();
		
		for( int i =1 ; i<= 9;i++)
		{
			int count = 0;
			for(int num : arrNumber)
			{
				if( num % i ==0)
				{
					count++;
				}
				numberCountMap.put(i,count);
			}
		}
		System.out.println("Output:");
		System.out.print("{");
		int j= 0;
		int mapSize = numberCountMap.size();
		for(Map.Entry<Integer,Integer> entry:numberCountMap.entrySet() )
		{
			System.out.print(entry.getKey()+": "+entry.getValue());
			if( j < mapSize-1)
			{
				System.out.print(", ");
			}
			j++;
		}
		System.out.println("}");
		sc.close();
		

	}

}
