package File;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class FileReaderEx {

	public static void main(String[] args) throws IOException
	{
		try (// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("D:\\file3.txt.txt"))) {
			String line = reader.readLine();
			while (line != null);
			System.out.println("hello Java");
			line= reader.readLine();
		}
	InputStreamReader reader = null;
	reader.close();

	}
	
}
