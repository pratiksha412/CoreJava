package Thread;

class Table {
	public synchronized void printtable(int n) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
}

class Power {
	public synchronized void printpower(int n) {
		int temp = 1;
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " ^ " + i + " = " + (n * temp));
			temp = temp * n;
		}
	}
}

class First extends Thread {
	Table t;

	First(Table t) {
		this.t = t;
	}

	public void run() {
		t.printtable(5);
	}
}

class Second extends Thread {
	Table t;

	Second(Table t) {
		this.t = t;
	}

	public void run() {
		t.printtable(6);
	}
}

class Third extends Thread {
	Power p;

	public Third(Power p) {
		this.p = p;
	}

	public void run() {
		p.printpower(3);
	}
}


public class MulTableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		First f = new First(t);
		//f.start();
		Second s = new Second(t);
		//.start();
		Power p = new Power();
		Third th = new Third(p);
		th.start();
		f.start();
		s.start();

	}


	}


