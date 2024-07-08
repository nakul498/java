import java.util.*;
class randomCheck{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList<>();
        int sum = 0;
        al.add(1);
        al.add(2);
        al.add(1,2);
        al.add(0,3);
        al.add(4,3);
        al.remove(2);
        
        for(int x: al){
            System.out.println(x);
        }
        System.out.println(al.get(2));
     
    }
}