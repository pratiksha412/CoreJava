package Thread;

class EvenThread extends Thread {
	public void run() {
		int n = 10;
		System.out.println("Even number series:");
		for(int i = 1; i< n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

class Thread4 extends Thread{
	public void run() {
		int i;
		System.out.println("Table of 2:");
		for(i=1; i<=10;i++) {
			System.out.println(i * 2);
		}
		
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EvenThread ob= new EvenThread();
    ob.start();
    Thread4 ob1 = new Thread4();
    ob1.start();
 
	}

}
