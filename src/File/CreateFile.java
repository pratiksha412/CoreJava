package File;
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:Demo.txt");

		if (file.createNewFile())
		{ 
		System.out.println("File is created.");
		}
		else 
		{
		System.out.println("File is not created.");
		}
		
		}
		

	}


