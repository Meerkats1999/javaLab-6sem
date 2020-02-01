package meerkats;
import java.util.Scanner;
import java.lang.Math;

public class happyNum {
	int sum=0;
	
	int proceed(int sum) {
		
		int fin=0;
		String temp=Integer.toString(sum);
		int len=temp.length();

			for(int i=0;i<len;i++)
			{
				
				System.out.println("1 : " +(int)Math.pow(sum%10,2));
				fin=fin+(int)Math.pow(sum%10,2);
				sum=sum/10;
			}
			sum=fin;
			return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter num: ");
		int num=(int)Math.pow(in.nextInt(), 2);
		System.out.println(num);
		happyNum p=new happyNum();
		while(num>9)
		{
			System.out.println(p.proceed(num));
			num=p.proceed(num);
		}
		if(num==1)
			System.out.println("Happy");
		else
			System.out.println("Unhappy");
		
		in.close();
	}
	
}
