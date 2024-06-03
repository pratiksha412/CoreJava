package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		        //Byte Stream
		        //Write the data
		        File f=new File("D:JAVA.txt");
		        FileOutputStream fos=new FileOutputStream(f);//create file file22.txt in f:
		        //FileOutputStream fos = new FileOutputStream("f:/file2.text");
		        String s = "...Hello Everyone...Java Full Stack...Java provides I/O Streams to read and write data where, a Stream represents an input source or an output destination which could be a file, i/o devise, other program etc. InputStream − This is used to read (sequential) data from a source";
		        byte b[] = s.getBytes();
		        fos.write(97);//A
		        fos.write(66);//B
		        fos.write(67);//C
		        fos.write(b);
		        
		        System.out.println("Content Written Successfully.");
		        

	}

}
