import java.util.*;
class Parent{
    //this is static method
    static void test(){
        System.out.println("Parent");
    }
}
public class Child extends Parent {
    public static void main(String[] args) {
        Parent p = new Child();
        p.test();
    }
    static void test(){
        System.out.println("Child");
    }
}
