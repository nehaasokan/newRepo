package Programs;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		double s,a;
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter the side of the square");
		s=in.nextDouble();
		a=s*s;
		System.out.print("The area of the square is" +a);
		
	}

}
