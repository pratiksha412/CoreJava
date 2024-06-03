package oopsConcept;

class parent {
	public void add() {
	}
	 int a = 10, b=20;
	 
	
		
}

	  

  class Child extends parent  {
      public void sub()
      {
	 int a = 20, b =10;
	 System.out.println("Child class Subtraction is: " +(a - b));
      }

	public void mul() {
		// TODO Auto-generated method stub
		
	}

	}
      
      
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.add();
		child.sub();
		child.mul();
		

	}

}
