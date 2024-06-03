package java8feature;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Birth date(yyy-mm-dd format only) ");
		String st = sc.nextLine();
		
		LocalDate Dob;
		Dob = LocalDate.parse(st);
		
		System.out.println("Age is :- "+calcAge(Dob));
	}

	static int calcAge(LocalDate st)
	{
		LocalDate CurrentDate = LocalDate.now();
		LocalDate currentDate = null;
		int age = Period.between(st,currentDate).getYears();
		return age;
	}
}
