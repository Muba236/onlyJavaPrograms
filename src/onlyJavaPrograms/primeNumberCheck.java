package onlyJavaPrograms;

import java.util.Scanner;

public class primeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check Prime Number or not: ");
		
		int input = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i=2; i<= Math.sqrt(input); i++) {
			
			if(input%i == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		System.out.println("The provided input is Prime number " +isPrime);

	}

}
