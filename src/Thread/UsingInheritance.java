package Thread;

class Thread1 extends Thread {
	public void run() {
		display();
		for(int i= 0; i < 5 ; i++) {
			System.out.println("My Thread" + i);
		}
		
	}

	public void display() {
		System.out.println("Thread1 display");
	}
}

class Thread2 extends Thread {
	public void run() {
		for(int i= 10; i < 15 ; i++) {
			System.out.println("My Thread"+ i);
		}
		
	}


public class ThreadUsingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();

	}

}
}
