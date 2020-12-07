package assignment2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
			
		int n,num,digit,rev=0;
		System.out.println("Enter a number");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		n = num;

	     do
	     {
	         digit = num % 10;
	         rev = (rev * 10) + digit;
	         num = num / 10;
	     } while (num != 0);
	     
	     System.out.println("The reverse of a number is"+rev);	
	     if(n==rev)
	     {
	    	 System.out.println("The number is palindrome"); 
	     }
	     else
	     {
	    	 System.out.println("The number is not palindrome"); 
	     }
	     
}
}