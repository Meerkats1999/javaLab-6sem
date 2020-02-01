//Not Lab Program

package meerkats;
import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean flag = true;
		while(flag) {
			System.out.print("Enter 2 numbers: ");
			double a = in.nextDouble();
			double b = in.nextDouble();
		
			double res;
		
			System.out.print("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
			int n = in.nextInt();
		
			switch(n) {
			case 1:
				res = a+b;
				System.out.println("Sum = "+res);
				break;
			
			case 2:
				res = a-b;
				System.out.println("Difference = "+res);
				break;
				
			case 3:
				res = a*b;
				System.out.println("Product = "+res);
				break;
				
			case 4:
				res = a/b;
				System.out.println("Quotient = "+res);
				break;
				
			case 5:
				flag = false;
				break;
				
			default:
				System.out.println("Invalid\nTry Again");
			}
		}
		in.close();
	}
}
