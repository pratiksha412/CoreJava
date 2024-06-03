package access_specifier;


class Bike {
	protected String name =" Pratiksha";
	
	public void display() {
		System.out.println(" Display Bike " + name);
		
	}
}
  class Bike1 extends Bike {
	  protected String name = "Mercedez Benz";
	  
	  public void display()
	  {
		  System.out.println("Display Bike 1 " + name);
	  }
  }
  
  public class Protected_Access_Specifier {
	 
	  public static void main(String[] args)
	  {
		Bike bike = new Bike();
		Bike1 bike1 = new Bike1();
		bike.display();
		bike1.display();
	  }
  }