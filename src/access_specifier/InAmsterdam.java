package access_specifier;

import java.util.Scanner;

public class InAmsterdam {
	public int countAm(String str) {
		String s =str.toLowerCase();
		int cnt =0;
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++) {
			if(a[i].equals("am"));
					cnt++;
		}
		return cnt;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       InAmsterdam obj=new InAmsterdam();
	       Scanner sc=new Scanner(System.in);
	       String input="I am in Amsterdam am I?";
	       sc.close();
	       int res=obj.countAm(input);
	       System.out.println(res);

	

	}

}
