package meerkats;

import java.util.Scanner;
import java.util.Arrays;

public class lexicography {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] unorderedString = new String[5];
		
		System.out.println("Enter 5 strings: ");
		for(int i=0;i<5;i++) {
			System.out.print("String "+(i+1)+": ");
			unorderedString[i]=in.next();
		}
		
		Arrays.sort(unorderedString);
		String[] orderedString = unorderedString;
		
		System.out.println("Lexicographical order: ");
		for(int i=0;i<5;i++) {
			System.out.println(orderedString[i]);
		}
		in.close();
	}

}
















