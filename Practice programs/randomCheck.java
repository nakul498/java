import java.util.*;
class randomCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start =0, end= s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                System.out.println("Not a palindrome");
                return;
            }
            start++; end--;
        }
        System.out.println("ohh yes it was a palidrome");
        sc.close();
    }
}
