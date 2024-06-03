package oopsConcept;

public class Bycycle {
	String bName;
	String bPrice;

	public Bycycle(String name, String price) {// PAramerterised constructor
		bName = name;
		bPrice = price;
	}
	Bycycle(){               //Default constructor
		bName="Ladybird";
		bPrice="5000";
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbPrice() {
		return bPrice;
	}

	public void setbPrice(String bPrice) {
		this.bPrice = bPrice;
	}
	void display() {
		System.out.println(bName+ " : "+bPrice);
	}

	public static void main(String[] args) {
		Bycycle bicycle=new Bycycle("Hero", "10000");
		bicycle.display();
		Bycycle bicycle1=new Bycycle();
		bicycle1.display();
		

	}


	}


