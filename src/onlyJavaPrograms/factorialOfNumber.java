package onlyJavaPrograms;

import java.util.Scanner;

public class factorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to see the Factorial: ");

		int input = sc.nextInt();
		
		int factorial = 1;
		
		for(int i=1; i<=input; i++) {
			
			factorial *= i;
			
		}
		
		System.out.println("The Factorial of the given number " +input+ " is " +factorial);
		
	}

}
