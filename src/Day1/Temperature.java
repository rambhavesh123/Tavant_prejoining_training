package Day1;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Option \n 1- For Celsius to Fahrenheit Conversion\n 2- For Fahrenheit to Celsius\n");
		int option;
		option=sc.nextInt();
		if(option==1)
		{
			double celsius;
			System.out.println("Enter temperature in Celsius");
			celsius=sc.nextInt();
			System.out.println(CalculateTemperature.convertToFarenheit(celsius));
		}
		else
		{
			double fahrenheit;
			System.out.println("Enter temperature in Fahrenheit");
			fahrenheit=sc.nextInt();
			System.out.println(CalculateTemperature.convertToCelsius(fahrenheit));
		}
		sc.close();
	}
	

}
 class CalculateTemperature
{
	public static double convertToFarenheit(double celsius)
	{
		double Fahrenheit;
		Fahrenheit = 9 * (celsius / 5) + 32;
		return Fahrenheit;
	}
	public static double convertToCelsius(double fahrenheit)
	{
		double Celsius;
		Celsius = (fahrenheit - 32) * 5 / 9;
		return Celsius;
	}
}