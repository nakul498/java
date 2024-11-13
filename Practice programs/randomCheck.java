import java.util.*;


public class randomCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new HashSet<>();
        System.out.println("enter elements for tree set");
        for(int i = 0;i<10;i++){
            set.add(sc.nextInt());
        }
        System.out.println("enter elements for linnked hash set");
        for(int i = 0;i<10;i++){
            set2.add(sc.nextInt());
        }

        System.out.println("enter elements for hash set");
        for(int i = 0;i<10;i++){
            set3.add(sc.nextInt());
        }

        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);

    }
}