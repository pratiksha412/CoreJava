package oopsConcept;

public class Employees
{
	String empname;
	String designation;
	int salary;
	public Employees(String empname, String designation, int salary) {
		super();
		this.empname = empname;
		this.designation = designation;
		this.salary = salary;
	}
	public Employees() {
		empname="Parth";
		designation="Engineering";
		salary=30000;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	void display()
	{
		System.out.println(empname+" "+designation+" "+salary);
	}
	public static void main(String[] args) {
		Employees ob=new Employees();
		ob.display();
//		Employees ob1=new Employees();
//		ob.display();
		
	}



	
	}


