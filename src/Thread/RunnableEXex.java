package Thread;

class ThreadTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("My Thread 1 : " + i);
        }
        
    }    
}


public class RunnableEXex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ThreadTwo t1=new ThreadTwo();
	        //t1.run();
	    Thread t=new Thread(t1);
	   t.start();
	    }
	

	}


