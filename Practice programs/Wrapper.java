import java.util.*;
class Wrapper{
    public static void main(String args[]){
        int a = 10; // primitive Type
        Integer x = new Integer(10); // object Cration
        int b = new Integer(20); //unboxing
        int e = Integer.valueOf(10); // as unboing above is deprecated so just tried
        Integer c = 20; //Autoboxing
        Integer y =130;
        byte h = y.byteValue();
        System.out.println(h );
        Integer z = (int) (a +10.1); 
    }
}