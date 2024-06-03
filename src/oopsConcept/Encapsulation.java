package oopsConcept;

class product1 {
	private int p_id;
	private String pName;
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public product1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product1(int p_id, String pName) {
		super();
		this.p_id = p_id;
		this.pName = pName;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product1 ob = new 	product1(102,"HP");
		System.out.println(ob.getP_id()+" "+ob.getpName());

	}

}
