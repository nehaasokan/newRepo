package Programs;
import java.util.Scanner;


public class Largest {
	public static void main(String[] args) {
    int a,b,c;
    System.out.println("Enter three numbers");
	Scanner in=new Scanner(System.in);
    a =in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	
	if (a>b&&a>c)
		 System.out.println("The largest number is"+a);
	else if (b>c)
		
		System.out.println("The largest number is"+b);
	else
		System.out.println("The largest number is"+c);
		
}
}