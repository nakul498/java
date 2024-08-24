import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumComplement {
 
    public static void main(String args[]) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            int finalNum = process(num);
            System.out.println(finalNum);
        }catch(Exception E){
            
        }
    }
    static int process(int num){
        int r=0;
        int k=0; double fnum=0;
        while(num!=0){
            r=num%2;
            if(r==0)
                r=1;
            else
                r=0;    
           fnum= fnum + (Math.pow(2, k))*(r);
           num =num/2;
           k++;
        }
        return (int)fnum;
    }
}

