package assignment2;
import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
	System.out.println("Enter a number");	
	int num, number, total = 0,temp;
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
    number = num;
    while (number != 0)
    {
        temp = number % 10;
        total = total + temp*temp*temp;
        number /= 10;
    }

    if(total == num)
    {
     
    System.out.println("The entered number is an Armstrong number");
    
    }else
    {
     
    System.out.println("The entered number is not an Armstrong number");
}
	}
}
