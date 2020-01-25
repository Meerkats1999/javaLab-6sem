package meerkats;
import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j = 0, k, n;
		System.out.print("Enter no. of levels: ");
		n = in.nextInt();
		
		//Star Pyramid
		for (i=1;i<=n;i++) {
			for (k = 1; k<=n-i;k++) {
				System.out.print("  ");
			}
			while(j != (2*i-1)) {
				System.out.print("* ");
				j++;
			}
			j=0;
			System.out.println(" ");
		}
		
		//Number Pyramid
		int count1 = 0, count2 = 0;
		for (i=1;i<=n;i++) {
			for (k = 1; k<=n-i;k++) {
				System.out.print("  ");
				count1++;
			}
			while(j != (2*i-1)) {
				if(count1<=n-1) {
					System.out.print((i+k)+" ");
					count1++;
				}
				else {
					count2++;
					System.out.print((i+k-2*count2)+" ");
				}
				j++;
			}
			j=0;
			System.out.println(" ");
		}
		
		in.close();
		
	}
}
		

