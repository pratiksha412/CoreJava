package oopsConcept;

public class methodtypes 
{
	int add(int a,int b)
	{
		return a+b;
	}
	void addition(int a,int b)
	{
		System.out.println("Additing 2 numbers:"+(a+b));
	}
	static String display()
	{
		return "Speak something in class";
	}
	float area(int r) {
		return(float)(3.14 * r);
	}
	public static  void main(String[] args) {
		methodtypes obj = new methodtypes();
         System.out.println(((methodtypes) obj).add(5,5));
         System.out.println(methodtypes.display());
         System.out.println(obj.area(3));
         obj.addition(12,32);
         
	}

}
