import java.util.*;
public class TakeGifts2558 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int gifts []= {1,2,4,5,6,3,2,6,7,435,543,232};
        int k=3;
        for(int x:gifts){
            pq.add(x);
        }
        System.out.println(pq);
        while(k!=0){
            int x = pq.peek();
            if(pq.peek()!=0){
                pq.add((int) Math.floor(Math.sqrt(x)));
                pq.remove();
            }
            k--;
        }
        System.out.println(pq);
    }
}
