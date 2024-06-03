package Thread;


class Thread6 extends Thread{
    int sum=0;
    public void run(){
        
        synchronized(this){
            for(int i=1;i<=10;i++){
                sum+=i;
            }
            //child thread send notification to Main thread
            this.notify();
        }
    }
}
public class powersynchroex {

    public static void main(String[] args) throws Exception {
        Thread6 t=new Thread6();
        t.start();
        
        synchronized(t){
            //Main thread calling wait() method
            t.wait();
            //Main Thread get notification 
            System.out.println(t.sum);
        }
        
        
    }
}
