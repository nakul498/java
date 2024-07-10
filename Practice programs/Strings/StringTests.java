import java.util.*;
public class StringTests {
    public static void main(String[] args) {
        // there are 6 type of constructor in String Class
        char [] s = {'H','e','l', 'l', 'o', ' ' ,'W','o','r','l','d'};
        byte b[]={82,65,86,73};
        String s1 = new String();
        String s2 = new String("hi");    
        String s3 = new String(s,1,6);  
        String s4 = new String(b);  
        String s5 = new String(b,1,2);  
        System.out.println("original String is "+s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        String r = "Var1";
        String r1 = "Var1";
        System.out.println(("checking if two string are equal or not lets say first is "+r +"and other is "+ r1));
        if(r.equals(r1)){
            System.out.println("yes they are equal");

        }
        String h = "Hello world how are you ";
        char k[] = h.toCharArray();
    }
    
}
