import java.util.*;
class messagepassing{
    public static void main(String args []){
       
        // Dog d1 = new Dog("Black");
        Dog d1 = new Dog();
        System.out.println(d1);
       
    }
}
class Dog extends RuntimeException{
    String color;
    Dog(){
         //here runtimeException is given a new message
        super("Hello World: meow");
    }
    // Dog(String s){
    //     color = s;
    // }
    // public String toString(){
    //     return " this is a "+color+" Dog";
    // }
}