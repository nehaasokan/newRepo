package Programs;
import java.util.Scanner;
public class Interest {
	

		public static void main(String[] args) {
			float p,r,t,i;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the values of principal amount");
			p=in.nextFloat();
			
			System.out.println("Enter the Rate of Interest");
			r=in.nextFloat();
			System.out.println("Enter the time period");
			t=in.nextFloat();
			i=(p*r*t/100);
			System.out.println("The Interest is =" +i);
		}
}
