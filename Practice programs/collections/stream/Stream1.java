import java.util.*;
public class Stream1 {
  public static void main(String args[]){
    List<Integer> list = new ArrayList<>();
    list.add(32);
    list.add(342);
    list.add(342);
    list.add(5443);
    int count = 0;
    count = (int) list.stream().filter((Integer sal) -> sal>300).count();
    list.stream().forEach( x -> System.out.println(++x));
    System.out.println(count);
  }
}
