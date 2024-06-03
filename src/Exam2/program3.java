package Exam2;
import java.util.*;

import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;



@FunctionalInterface
interface StringSpace {
	String addSpace(String s);
}

public class program3 {
	
	static String insertSpace(String s)
	{
		StringSpace sp=(s1)->{
			return s1.join(" ",s.split(" "));
	};
	
	return sp.addSpace(s);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Program1 p =new Program1();
        String str="capgemini";
        System.out.println(program3.insertSpace(str));

	
	}

}
