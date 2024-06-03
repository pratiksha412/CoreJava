package uppercase;

import java.util.Scanner;

public class Char_uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		for(int i =1; i<=num;i++)
		{
			for(int j =1; j<= i; j++)
			{
				char upperchar = Character.toUpperCase((char) (j + 96)) ;
				System.out.print(upperchar);
			}
			System.out.println();

		}

	}

}
