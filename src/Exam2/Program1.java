package Exam2;
import java.io.*;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Program1 {
	
	public int  getSecondSmallest(int []arr) {
		if(arr==null || arr.length<2) {
			return Integer.MAX_VALUE;
			
		}
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int num:arr) {
			if(num<smallest) {
				secondSmallest=smallest;
				smallest = num;

			}
			else if(num<secondSmallest && num!=smallest) {
				secondSmallest=num;
			}
			
		}
	
		
    if(secondSmallest==Integer.MAX_VALUE) {
    	return Integer.MAX_VALUE;
    }
    
    return secondSmallest;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Program1 s= new Program1();
        int[] sampleInput = {23,45,22,20,96};
        System.out.println(s.getSecondSmallest(sampleInput));
	}

}

