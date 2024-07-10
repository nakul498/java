import java.util.*;
public class CustomeException {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the palindrome string ");
        String s = "";
        if(args.length > 0){
        s = args[0];
        }
        else
            s = sc.next();
        if(isPallindrome(s))
            System.out.println("pallindrome");
        else{
            NotPallindromeException obj = new NotPallindromeException();
            try{
                throw obj;
            }catch(NotPallindromeException ex){
                System.out.println(ex.getMessage());
                System.out.println("enter a pallindrome");
                s= sc.next();
            }
        }    
            
    }
    static boolean isPallindrome(String s){
        StringBuilder sb = new StringBuilder();
        sb=sb.reverse();
        if(s.equals(sb.toString())){
            return true;
        }
        else 
            return false;
    }
}
// public String toString(){
//     return ("your string is not a pallindrome");
// }

class NotPallindromeException extends RuntimeException{
    // here as we inherit runtime exception class which is uncheckedd exception, even if we donot write anything
    // in class, program would work fine but if there was any checked exception ,
    // there would be error with empty class
    NotPallindromeException(){
        super("String is not a pallidrome");
    }
}