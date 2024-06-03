package exception1;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class fileNotChecked {
	public static void main(String[] args) throws Exception,IOException,SQLException  {
        File f = new File("f:/file333pooja.txt");
        if(!f.exists()){
        throw new Exception("File doesnot exist "+f.toString());
        }
        else {
        System.out.println("Welcome, we got into file "+f.toString());
        }
    }


	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

