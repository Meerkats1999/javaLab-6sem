package meerkats;
import java.util.Scanner;

public class lexicographyBubble {
	
	static String[] bubbleSort(String[] str)
    {
        String temp;
        for (int j = 0; j < str.length; j++) {
        	for (int i = j + 1; i < str.length; i++) {
        		if (str[i].compareToIgnoreCase(str[j]) < 0) {
        			temp = str[j];
        			str[j] = str[i];
        			str[i] = temp;
        		   	}
        	}
        }
        return str; 	
    }

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] unorderedString = new String[5];
		
		System.out.println("Enter 5 strings: ");
		for(int i=0;i<5;i++) {
			System.out.print("String "+(i+1)+": ");
			unorderedString[i]=in.next();
		}
		
		String[] orderedString = bubbleSort(unorderedString);
		
		System.out.println("Lexicographical order: ");
		for(int i=0;i<5;i++) {
			System.out.println(orderedString[i]);
		}
		in.close();
	}

}
















