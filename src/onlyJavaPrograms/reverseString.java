package onlyJavaPrograms;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the text to be reversed: ");
		
		String input = sc.nextLine();
		
		StringBuilder reversed = new StringBuilder(input).reverse();
		
		System.out.println(reversed);

	}

}
