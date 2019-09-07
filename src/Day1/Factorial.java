package Day1;

import java.util.Scanner;

public class Factorial {
    
	  static int FactorialOFNumis(int Num)
		{
			if(Num == 0)
				return 1;
			else
				return (Num*FactorialOFNumis(Num-1));
		}
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int Num;
	System.out.println("Please Enter Start Number and End Number");
	Num=sc.nextInt();
	System.out.println("Factorial of "+Num+" is :"+FactorialOFNumis(Num) );
	sc.close();
	}
}
