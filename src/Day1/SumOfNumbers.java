package Day1;

import java.util.Scanner;

public class SumOfNumbers {
	public static int SumOfOddNumbers(int start, int end)
	{
		int SoOdds=0;
		if(start%2==0)
			start+=1;
		for(int i=start;i<=end;i=i+2)  //This will Take O(n/2) Time
		 SoOdds+=i;
	return SoOdds;
	}
	public static int SumOfEvenNumbers(int start, int end)
	{
		int SoEvens=0;
		if(start%2==1)
			start+=1;
		for(int i=start;i<=end;i=i+2)   //This will Take O(n/2) Time
		 SoEvens+=i;
	 return SoEvens;
	}
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int start,end;
	System.out.println("Please Enter Start Number and End Number");
	start=sc.nextInt();
	end=sc.nextInt();
	System.out.println("Sum Of Odd Numbers is :"+SumOfOddNumbers(start,end));
	System.out.println("Sum Of Even Numbers is :"+SumOfEvenNumbers(start,end));
	sc.close();
	}
}
