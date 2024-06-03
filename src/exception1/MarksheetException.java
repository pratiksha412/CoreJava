package exception1;

class MarkException extends Exception{
	public MarkException(String m) {
		super(m);
	}
}


public class MarksheetException {

	public static void main(String[] args) {
       MarksheetException m=new MarksheetException();
       try {
    	   String result = m.invalidMark(-80);
    	   System.out.println(result);
       }
       catch(MarkException e)
       {
    	   System.out.println(e);
       }
	}
   String invalidMark(int mark)throws MarkException{
	   if(mark<0 ||mark>100) {
		   throw new MarkException("Mark should be trange of 0 and 100");
		   
	   }
	return "Valid Mark";
   }
}
