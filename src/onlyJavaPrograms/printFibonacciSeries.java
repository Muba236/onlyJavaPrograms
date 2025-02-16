package onlyJavaPrograms;

import java.util.Scanner;

public class printFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number you want to see the Fibonacci series within");
		
		int input = sc.nextInt();
		
		int num1=0, num2=1;
		
		System.out.println("Fibonacci Series is: \n" +num1+ "\n" +num2);
		
		for(int i=2; i<input; i++) {
			
			int num3 = num1 + num2;
			
			System.out.println(num3);
			
			num1 = num2;
			
			num2 = num3;
		}
	}

}
