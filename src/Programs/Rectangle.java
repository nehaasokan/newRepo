package Programs;

import java.util.Scanner;

public class Rectangle {
		public static void main(String[] args) {
			double l,b,a;
			Scanner in=new Scanner(System.in);
			
			System.out.print("Enter the length of the rectangle");
			l=in.nextDouble();
			System.out.print("Enter the breadth of the rectangle");
			b=in.nextDouble();
			a=l*b;
			System.out.print("The area of the rectangle is" +a);
			
		}
}
