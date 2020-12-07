package Programs;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		int a,b,temp;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter two numbers a and b");
	    a=in.nextInt();
	    b=in.nextInt();
	    temp=a;
	    a=b;
	    b=temp;
	
	    System.out.print("After swapping a=" +a);
	    System.out.print("After swapping b=" +b);  
	}
	

}
