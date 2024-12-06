import java.util.HashMap;
import java.util.Map;

public class FindChampion2924 {
    public static void main(String[] args) {
         Map<Integer, Integer> map = new HashMap<>();
         Map<Integer, Integer> map2 = new HashMap<>();
        int row = edges.length;
        int column = edges[0].length;
        for(int i=0;i<row;i++){
            map2.put(edges[row][0], map.getOrDefault(edges[row][0], 0) + 1);
        }
        for(int i=0;i<row;i++){
            map.put(edges[row][0], map.getOrDefault(edges[row][0], 0) + 1);
            map.put(edges[row][1], map.getOrDefault(edges[row][1], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (entry.getValue() == 0) {
                ans = entry.getKey();
                if(map2.containsKey(ans)){
                    count++;
                    if(count>=2)
                        return -1;
                }
                
            }   
        }
        return ans;
    }
}
