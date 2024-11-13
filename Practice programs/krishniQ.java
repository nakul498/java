import java.util.*;
public class krishniQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            for(char x='a';x<'z';x++){
               
                if(s.charAt(i)==x){
                    result = result+x;
                    break;
                }
                System.out.println(x);
           }
           System.out.println(result);  
        }
    }
}    
        