import java.util.Scanner;
public class ClosestPal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palo = sc.nextLine();
        int n = Integer.parseInt(palo);
        int s=n;
        int l=n;
        while(n>=0){
            if(checkPal(s)){
                n=s;
                break;
            }    
            else 
                s--;    
            if(checkPal(l)) {
                n=l;
                break;
            }    
            else
                l++;       
        }
        System.out.println(n);
    }
    static Boolean(int s){
        String str = s.toString();
        StringBuilder sr = new StringBuilder(str);
        String strRev = sr.reverse().toString();
        if(str.equals(strRev)){
            return true;
        }
        else 
            return false;
    }
}
