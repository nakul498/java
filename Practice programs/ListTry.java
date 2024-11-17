import java.util.*;
public class ListTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // List<Integer> list = new ArrayList<>();
        // for(int i=0;i< 5;i++){
        //     list.add(sc.nextInt());
        // }
        // System.out.println(list);
            List<String> list = new ArrayList<>();
    list.add("rinku");
    list.add("rakshit");
    list.add("vinod");
    list.add("perman");
    list.add("binod");
    list.stream().forEach(p -> System.out.println(p.charAt(0)));


        
    }
}
    