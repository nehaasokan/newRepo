package Programs;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
	    int a;
	    System.out.println("Enter a number");
		Scanner in=new Scanner(System.in);
	    a =in.nextInt();
		
		
		if (a>0)
			 System.out.println("The number is positive");
		
		else if (a<0)
			
			System.out.println("The number is negative");
		
		else
			System.out.println("The number is neither positive nor negative");
}
}