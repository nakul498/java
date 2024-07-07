import java.util.*;
public class ArrayListDemo {
    public static void main(String args[]){
       // ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(11.5);
        al.add("hi");
        System.out.println(al);

        ArrayList <Integer> al2 = new ArrayList<>(); // if we want only Integer objects
        al2.add(1);
        al2.add(2);
        al2.add(1,2);
        al2.add(0,3);
        al2.add(4,3);
        al2.remove(2);
        System.out.println(al2);
    }
}
    }
}
