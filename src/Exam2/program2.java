package Exam2;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class program2 {
	
	public static void calculateDistance(int t1,int t2)
	{
		
		int u=10;
		int a=5;
		int distanceTravel1=u*t1+((a*t1*t1)/2);
		int distanceTravel2=u*t2+((a*t2*t2)/2);
		System.out.println(distanceTravel1);
		System.out.println(distanceTravel2);
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         int firstValue;
         int secondValue;
         Scanner sc=new Scanner(System.in);
         firstValue=sc.nextInt();
         secondValue=sc.nextInt();
         calculateDistance(firstValue,secondValue);
	}

}
