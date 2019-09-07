package Day1;

import java.util.Scanner;

public class MarksValidatorSwitchCase
{
	public static boolean isPass(int marks)
	{
		if(marks<40)
			return false;
		else
			return true;
	}
	public static String markGrade(int marks)
	{
		int Num;
	        if (marks >90) 
	           Num=1; 
	         else if (marks > 75) 
	        	Num=2;
	         else if (marks >60) 
	        	Num=3;
	         else 
	        	Num=4;

			switch(Num)
			{
			case 1:
					return "You are Passed With Grade 'A'";
			
			case 2:
					return "You are Passed With Grade 'B'";
			
			case 3:
					return "You are Passed With Grade 'C'";
				
			default:
					return "You are Passed With Grade 'D'";
			}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int marks;
		System.out.println("Please Enter Your Marks");
		marks=sc.nextInt();
		if(isPass(marks))
		{
			System.out.println(markGrade(marks));
		}
		else
		{
			System.out.println("You are Failed");
		}
           sc.close();
	}

}
