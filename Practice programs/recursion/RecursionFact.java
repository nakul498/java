import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursionFact {
   
    static int factorial(int x){
        if(x==1)
            return 1;
        return x * factorial(x-1); 
    }
    public static void main(String[] args) { try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int factorial = factorial(n);
        System.out.println(factorial);
        }catch(Exception e){

        }
    }   
}
