package Programs;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter the values");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=x*y;
		System.out.println("The Multiplication is =" +z);
	}
}
