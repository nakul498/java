import java.util.*;

public class randomCheck{
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("vivek");
        l1.add("vikki");
        l1.add("kikki");
        l1.add("bikki");
        l1.add("chetak");
        List<Integer> l2 = new ArrayList<>();
        // l2.add("vivek");
        // l2.add("vikki");
        // l2.add("kikki");
        // l2.add("bikki");
        // l2.add("chetak");
        long count=0;
      l1.stream().filter(p->p.endsWith("k")).forEach(p->System.out.println(p));
        count =  l1.stream().filter(p->p.endsWith("k")).count();
        System.out.println(count);
        //l2.stream().filter()
    }
}