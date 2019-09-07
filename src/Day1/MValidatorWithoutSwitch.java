package Day1;

import java.util.Scanner;

public class MValidatorWithoutSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks;
		System.out.println("Please Enter Your Marks");
		marks=sc.nextInt();
		if(MarkValidator.isPass(marks))
		{
			System.out.println(MarkValidator.markGrade(marks));
		}
		else
		{
			System.out.println("You are Failed");
		}
           sc.close();
	}

}
class MarkValidator
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
		
	        if (marks >90) {
	            return "You are Passed With Grade 'A'";
	        } else if (marks > 75) {
	        	return "You are Passed With Grade 'B'";
	        } else if (marks >60) {
	        	return "You are Passed With Grade 'C'";
	        } else {
	        	return "You are Passed With Grade 'D'";
	        }
	}
}