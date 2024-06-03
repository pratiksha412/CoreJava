package examp;

public class Bicycle {
	String bName;
	String bPrice;

	public Bicycle(String name, String price) {// PAramerterised constructor
		bName = name;
		bPrice = price;
	}
	Bicycle(){
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

	public static void main1(String[] args) {
		Bicycle bicycle=new Bicycle("Hero", "10000");
		bicycle.display();
		Bicycle bicycle1=new Bicycle();
		bicycle1.display();
		

	}


	
	}


