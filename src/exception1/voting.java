package exception1;
class InvalidAgeForVoteException extends Exception{
    public InvalidAgeForVoteException(String s) {//To print customized message
        super(s);
    }
}
public class voting {

    String validAge(int age) throws InvalidAgeForVoteException  {
        if(age<15) {
            throw new InvalidAgeForVoteException("Age is smaller than 15");
        }
        else {
            return "Valid for vote ";
        }
    }
    public static void main(String[] args) {
    	voting v=new voting();
        
        try {
            System.out.println(v.validAge(4));
        } catch (InvalidAgeForVoteException e) {
            System.out.println(e.getMessage());
        
        }
    }
}


