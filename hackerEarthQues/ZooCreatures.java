import java.util.*;

public class ZooCreatures {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        int k = max;
        int rem = 0, div=0;
        int small = 0, large =1;
        for(int i = min; i>0;i--){
            rem = k%min;
            div = k/min;
           // System.out.print("Cycle "+(min-i) +" k = "+ k);
            k=max + rem;
            small = small +div;
           //  System.out.print(" Small = "+ small+" Large = "+ large);
            if(rem == 0)  
                break;    
            else{
                large = large + 1;  
            }       
//System.out.println("");
        }
        if(a==Math.max(a,b))    
            System.out.println('\n'+large+" "+small);
        else 
            System.out.println('\n'+small+" "+large);
    }
}         