package onlyJavaPrograms;

import java.util.Scanner;

/**
 * Program to check the given number is Palindrome or not?
 * 
 * @author Ali
 *
 */
public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number to check the Palindrome: ");
		
		String input = sc.nextLine();
		
		String palindrome = new StringBuilder(input).reverse().toString();
		
		if(input.equals(palindrome)) {
			System.out.println("The given number is Palindrome: " +input);
		}
		else {
			System.out.println("Enter the valid Palindrome number, " +input+ " is not a Palindrome number");
		}
	
	}

}
