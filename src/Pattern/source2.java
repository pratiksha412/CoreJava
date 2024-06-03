package Pattern;

import java.util.Scanner;


public class source2 {
	static void printpattern(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			int num1=in.nextInt();
			int num2=in.nextInt();
			int num3=in.nextInt();
			
			source2.printpattern(num1);
			source2.printpattern(num2);
			source2.printpattern(num3);
		}
}
	


	

