package oopsConcept;

class Vehicle2{//same package non subclass
    private  void disVehicle() {
        System.out.println("Vehicle");
    }
}
class Car2 extends Vehicle2{
    void disCar() {
        //disVehicle();  ->Same package subclass
        System.out.println("Car");
    }
}

public class PrivateDemo {
	  //When a method or variable is declared as private it can
    //be accessed only in that class.
    private int  s=100;
    private String display() {
        return "display"+s;
    }
    private PrivateDemo() {
        System.out.println("Private Constructor");
    }

    public static void main(String[] args) {
        PrivateDemo p=new PrivateDemo();
        System.out.println(p.display());
        Vehicle2 v=new Vehicle2();
        //v.disVehicle();->Same package non subclass not accessible private method

    }




	}

