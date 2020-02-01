//Not Lab Program

package meerkats;
import java.util.Scanner;

public class avg {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 3 numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int sum = (a+b+c);
		int avg = sum/3;
		System.out.print("Sum: "+sum+"\nAvg: "+avg);
		in.close();
	}

}
