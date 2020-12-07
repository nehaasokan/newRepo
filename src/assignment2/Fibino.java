package assignment2;
import java.util.Scanner;
public class Fibino {

	public static void main(String[] args) {
		int i,n,s1=0,s2=1,s3;
		System.out.println("Enter the limit");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		
		for(i=1;i<=n;i++)
		{
			
			
			s3=s1+s2;
			System.out.println("Fibonacci series is"+s3);
			s1=s2;
			s2=s3;
			
			
		}
		
	}

}
