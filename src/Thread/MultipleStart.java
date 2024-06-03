package Thread;


class Threads11 extends Thread{
    public void run() {
        System.out.println("Threass111");
    }
}


public class MultipleStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Threads11 t1=new Threads11();
	        t1.start();
	        t1.start();
	        t1.start();
	    }
	
	}



