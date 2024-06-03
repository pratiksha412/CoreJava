package Thread;

class ThreadOne implements Runnable {

@Override
public void run() {
	for(int i= 0; i < 10 ; i++) {
		System.out.println("My Thread" + i);
	}

}
}

public class UsingRunnableInterface 
{

	public static void main(String[] args) {
       ThreadOne ob= new ThreadOne();
       Runnable ob1 = new Thread(ob);
       ((Thread) ob1).start();
        

}

}



