import java.util.*;
public class ArrayListDemo {
    public static void main(String args[]){
       // ArrayList<Integer> al = new ArrayList<Integer>();
       Scanner sc = new Scanner(System.in);
       int search; // using same variable for search, remove etc
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(11.5);
        al.add("hi");
        System.out.println(al);
       // al.clear(); to clear all list 
        ArrayList <Integer> al2 = new ArrayList<>(); // if we want only Integer objects
        al2.add(1);
        al2.add(2);
        al2.add(1,2);
        al2.add(0,3);
        al2.add(4,3);
        System.out.println("existing array is "+ al2);
        System.out.println("enter the index of variable you want to remove");
        search = sc.nextInt();
        al2.remove(search);
        System.out.println("new list is "+al2);
        System.out.println("size of arrayList 2 is "+ al2.size());
        System.out.println("element at 2nd index is " + al2.get(2));
        System.out.println("Replacing element at 3rd index with 5, now list is  "+ al2 );
        al2.set(3,5);
        System.out.println("new list is "+ al2);
        System.out.println("checking if list contain 5 now");
        if(al2.contains(5)){
            System.out.println("checked, 5 is present");
        }
        System.out.println("okay i ll give you a chance to search also");
        search = sc.nextInt();
        System.out.println("now searching "+ search);
        if(al2.contains(search)){
            System.out.println("yes it is present");
        }else 
            System.out.println("you testing me, noughty boy");
        System.out.println("now we will check index of an object \nenter the object you want to find:");
        search=sc.nextInt();
        System.out.println("index of "+ search+" is "+ al2.indexOf(search));
        System.out.println("to search last index of some element now we will use lastIndexof, enter the element whose index you want to search ");
        search =sc.nextInt();
        System.out.println("last index of "+ search+" is "+al2.lastIndexOf(search));
    }
}
    