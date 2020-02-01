package meerkats;
import java.util.Scanner;

public class happyNum {

	static int numSquareSum(int n) 
	{ 
	    int squareSum = 0; 
	    while (n!= 0) 
	    { 
	        squareSum += (n % 10) * (n % 10); 
	        n = n/10;
	    } 
	    return squareSum; 
	} 
	
	static boolean isHappynumber(int n) 
	{ 
	    int firstNum, secondNum; 
	    firstNum = secondNum = n; 
	    do
	    { 
	        firstNum = numSquareSum(firstNum); 
	        System.out.println(firstNum);
	        secondNum = numSquareSum(numSquareSum(secondNum));
	   
	    } 
	    while (firstNum != secondNum); 
	    return (firstNum == 1); 
	} 
	   
	public static void main(String[] args) 
	{ 
		Scanner in = new Scanner(System.in);
		System.out.print("Enter nmuber: ");
		int n = in.nextInt();
	    if (isHappynumber(n)) 
	        System.out.println("Happy"); 
	    else
	        System.out.println("Unhappy");
	    in.close();
	} 
} 
