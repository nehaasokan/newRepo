package assignment2;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		
		int i=1,limit,sum=0;
		System.out.println("Enter the limit");
		Scanner in=new Scanner(System.in);
		limit=in.nextInt();
		
		while(i <= limit)
        {
            sum = sum +i;
            i++;
        }
		System.out.println("The sum of series is"+sum);
	}

	

}
