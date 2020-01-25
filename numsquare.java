package meerkats;
import java.util.Scanner;

public class numsquare {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		boolean flag = true;
		while(flag) {
			System.out.print("Enter value of n: ");
			int n = in.nextInt();
			int sum = 0;
			if(n<=0) {
				System.out.println("Invalid Input");
			}
			else {
				while(n!=0) {
					sum = sum +n*n;
					n--;
				}
				System.out.println("Number of squares: "+sum);
				flag = false;
			}
		}
		in.close();
	}
}
