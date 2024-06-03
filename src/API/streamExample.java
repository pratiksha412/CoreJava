package API;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp
{
	int eid;
    String ename;
    String designation;
    int salary;
    public Emp(int eid, String ename, String designation, int salary) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.designation = designation;
        this.salary = salary;
        
    }
    
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
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

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", salary=" + salary + "]";
	}
    
}



public class streamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Emp> a1 = new ArrayList<>();
	    a1.add(new Emp(1, "Manya", "Manager", 23000));
	    a1.add(new Emp(2, "Avinash", "TL", 24000));
	    a1.add(new Emp(3, "Munna", "Dev", 32000));
	    a1.add(new Emp(4, "Pooja", "Trainer", 39000));
	    a1.add(new Emp(3, "Munna", "PL", 35000));

	    List<String> ob=a1.stream().map(a->a.toString()).collect(Collectors.toList());
	    System.out.println("EMp list:"+ob);
	    Long count=a1.stream().count();
	    System.out.println("Count is:"+count);
	    
	    Set<String> ob1=a1.stream().map(a->a.toString()).collect(Collectors.toSet());
	    System.out.println("eMP LIST "+ob1);
	    Long countset=ob1.stream().count();
	    System.out.println("Count is:"+ob1);
	    
	    Stream<Emp> ob2=a1.stream().filter(a->a.getEname().contains("M"));
	    System.out.println("name start with M:"+ob2.collect(Collectors.toList()));
	    
	    System.out.println("sort employee by designation:");
	    a1.stream().sorted((e1, e2) -> (e1.getDesignation().compareTo(e2.getDesignation())))
	            .forEach(System.out::println);
	    System.out.println("sort employee by empname:");
	    List<Emp> sorted = a1.stream().sorted((o1, o2) ->o1.getEname().compareTo(o2.getEname())).collect(Collectors.toList());
	    System.out.println(sorted);
	}
	}
	


