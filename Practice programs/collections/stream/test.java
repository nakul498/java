import java.util.*;
public class test {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(33);
        list.add(53);
        list.add(87);
        int arr[] = list.stream().sorted().mapToInt(Integer::intValue);
    }
}
