import java.util.*;
class randomCheck{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr= s.toCharArray();
        Map<Character, Integer> test = new HashMap<>();
        for(char a : arr){
            if(test.containsKey(a)){
                test.put(a, test.get(a)+1);
            }
            else
                test.put(a,1);
        }
        System.out.println(test);
    }
}
