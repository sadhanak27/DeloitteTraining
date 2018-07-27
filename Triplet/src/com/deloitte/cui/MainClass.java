package com.deloitte.cui;

import java.util.Scanner;

public class MainClass {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = s.nextInt();
		int array[] = new int[n];
		System.out.print("enter all the numbers");
		for(int j=0;j<n;j++)
		{
			array[j]=s.nextInt();
		}
		boolean x= Check.checkTripplets(array);		
			if(x)
			System.out.println("triplets found");
			else
			System.out.println("not found");
	
	}

	}


