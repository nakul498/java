import java.util.*;
class randomCheck{
    public static void main(String args []){
        //Scanner sc = new Scanner(System.in);
        // Dog d1 = new Dog("Black");
        Dog d1 = new Dog();
        System.out.println(d1);
    }
}
class Dog extends RuntimeException{
    String color;
    Dog(){
        super("Hello World: meow");
    }
    // Dog(String s){
    //     color = s;
    // }
    // public String toString(){
    //     return " this is a "+color+" Dog";
    // }
}