package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mergingfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileOne, fileTwo, fileThree, line, content="";
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Name of First File:");
	      fileOne = scan.nextLine();
	      System.out.print("Enter the Name of Second File:");
	      fileTwo = scan.nextLine();
	      System.out.print("Enter the Name of Third File:");
	      fileThree = scan.nextLine();
	      try
	      {
	         FileReader frOne = new FileReader("D:\\file1.txt.txt");
	         BufferedReader brOne = new BufferedReader(frOne);
	         FileReader frTwo = new FileReader("D:\\file2.txt.txt");
	         BufferedReader brTwo = new BufferedReader(frTwo);
	         
	         for(line=brOne.readLine(); line!=null; line=brOne.readLine())
	            content = content + line + "\n";
	         brOne.close();
	         
	         for(line=brTwo.readLine(); line!=null; line=brTwo.readLine())
	            content = content + line + "\n";
	         brTwo.close();
	         
	         try
	         {
	            FileWriter fw = new FileWriter("D:\\file3.txt.txt", true);
	            fw.write(content);
	            fw.close();
	            System.out.println("\nSuccessfully merged the content of two files into the third file");
	         }
	         catch(IOException ioe)
	         {
	            System.out.println("\nSomething went wrong!");
	            System.out.println("Exception: " +ioe);
	         }
	      }
	      catch(IOException ioe)
	      {
	         System.out.println("\nSomething went wrong!");
	         System.out.print("Exception: " +ioe);
	      }

	}

}
