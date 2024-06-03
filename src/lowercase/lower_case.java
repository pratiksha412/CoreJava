package lowercase;

import java.util.Scanner;

public class lower_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++) {
			for(int j =1; j<= i; j++)
			{
				char lowerChar = Character.toLowerCase((char) (j + 96));
				
				System.out.print(lowerChar);
			}
			System.out.println();
		}
	}

}
