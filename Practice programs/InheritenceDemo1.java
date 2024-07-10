import java.util.*;
public class InheritenceDemo1{
    public static void main(String args[]){
        Car1 c = new ElectricCar1();
        c.brake();
    }
}
class Car1 {
    void accelerate(){
        System.out.println("Accelerate in car");
    }
    void brake(){
        System.out.println("Mechanical Break in car");
    }
}
class ElectricCar1 extends Car1{
    void autoDrive(){
        System.out.println("AutoDrive");
    }
    void brake(){
      //  super.brake();
        System.out.println("brake is applied");
    }
}
