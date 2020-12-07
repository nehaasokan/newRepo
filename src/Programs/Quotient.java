package Programs;

import java.util.Scanner;

public class Quotient {
	public static void main(String[] args) {
		int x,y,z,r;
		System.out.println("Enter the value of dividend");
		System.out.println("Enter the value of divisor");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=x/y;
		r=x%y;
		System.out.println("The Quotient is =" +z);
		
		System.out.println("The Remainder is =" +r);
}
}