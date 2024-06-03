package oopsConcept;
     
    class GrandFather {
    	public void add() {
    		int a = 10, b = 20;
    		System.out.println("Grand Father Addition is: " +(a+b));
    		
    		}
    }
    class Father extends GrandFather
    {
    	
    	public void sub()
    	{
    		int a = 20,b = 12;
    		System.out.println("Father Subtraction is: " + (a-b));
    	}	
    		
    		
  
    
    class Child1 extends Father 
    {
    
    	public void mul()
    	{
    		int a = 5,b = 7;
    		System.out.println("Child  Multiplication is:" + (a*b));
    	}
    }

public class Multilevelinheritance {

	public static void main(String[] args) 
	{
	  Child child=new Child();
	  child.add();
	  child.sub();
	  child.mul();
		
	}

}
    }
 
