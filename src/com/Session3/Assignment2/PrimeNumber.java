package com.Session3.Assignment2;

import java.util.Scanner;

public class PrimeNumber {
	/*
	 * Problem :
	 * Write a simple Java program to check whether a given number is a prime number or not.
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("Please enter a integer number for checking is it prime or not.");
		Scanner scan = new Scanner(System.in);
		PrimeNumberCalculator p = new PrimeNumberCalculator(scan.nextInt());
		if(p.isPrime())
		{
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number in not prime");
		}
		
	}
}

/*
 * Please describe me Why i cannot use public when create this calss in same file 
 * Like public class PrimeNumberCalculator
 */
class PrimeNumberCalculator
{
	private int number;
	public PrimeNumberCalculator(int number)
	{
		this.number = number;
	}
	
	public boolean isPrime()
	{
		int devideCount = 0;
		for(int i= 1; i<= this.number; i++ )
		{
			
			/* 
			 * Please suggest me why i cannot use this statement here 
			 * 	if(!(boolean)(this.number%i))
				{
					devideCount++;
				}
			 */
			if(this.number%i ==0)
			{
				devideCount++;
			}
			if(devideCount ==3)
			{
				break;
			}
		}
		if(devideCount ==3)
		{
			return false;
		}
		
		return true;
	}
}