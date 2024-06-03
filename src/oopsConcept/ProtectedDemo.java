package oopsConcept;

class Car1 {
    protected int speed;;
    protected Car1(int speed) {
        this.speed=speed;
    }
    // protected method
    protected void display() {
        System.out.println("Car class"+this.speed);
    }
}
class BMW extends Car1{//we can access protected in  subclass
    protected BMW(int speed) {
        super(speed);
        // TODO Auto-generated constructor stub
    }
    void displayBMW(){
        display();
        System.out.println("BMW class");        
    }    
}
public class  ProtectedDemo  {    
    public static void main(String[] args) {
        Car1 c=new Car1(100);//we can access protecteed in non subclass
        c.display();
        BMW b=new BMW(300);
        b.displayBMW();
    }
}


	


