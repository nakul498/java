import java.util.*;
class randomCheck{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> fList = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();
        String n = sc.nextLine();
        String sArray [] = n.split(" ");
        for(String s: sArray){
            int no = Integer.parseInt(s);
            fList.add(no);
            counts.put(no, counts.getOrDefault(no, 0) + 1);
        }
        System.out.println("list is "+ fList );
        Collections.sort(fList);
        System.out.println("list after sorting: "+ fList); 
        for (Map.Entry<Integer, Integer> entry :  counts.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
        int maxCount = 0;
        for (int count : counts.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        
        // Count the number of keys with the maximum value
        int maxCountKeys = 0;
        for (int count : counts.values()) {
            if (count == maxCount) {
                maxCountKeys++;
            }
        }
        System.out.println(maxCountKeys);
    }
}
