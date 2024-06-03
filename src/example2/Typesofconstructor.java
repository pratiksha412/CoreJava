package example2;

public class Typesofconstructor {
      
	    String name;
	    int age;
	    
	    public  Typesofconstructor() {
	    System.out.println("Default Constructor");    	
	    }
	    
	    void ConstructorTypes(String nm) {//defining method
	    name=nm; 
	    
	    System.out.println("Parametrized method :" +name);
	    }
	    
	    Typesofconstructor(String nm){ //defining method
	    	name=nm;
	    	
	    	System.out.println("Parametrized Constructor:" +name);
	    }
	    
	    Typesofconstructor(String nm,int age){
	    	name=nm;
	    	this.age=age;
	    	
	    	System.out.println("Parametrized Constructor:" +name +":" +this.age);
	    	
	    }
	    
	    Typesofconstructor(Typesofconstructor cobj ){
	    	name=cobj.name;
	    	age= cobj.age; 
	    	System.out.println("copy Constructor" +name +":" +this.age);
	    }
	    	
	    	
	public static void main(String[] args) {
		Typesofconstructor c=new Typesofconstructor();
		Typesofconstructor cw=new Typesofconstructor("pratiksha");
		c.Typesofconstructor(); //calling method
		//c1=mew Typesofconstructor("EduBridge");
		Typesofconstructor c2=new Typesofconstructor("EduBridge",25);
		Typesofconstructor c3=new Typesofconstructor(c2);
		
		
	}

	private void Typesofconstructor() {
		// TODO Auto-generated method stub
		
	}

}
