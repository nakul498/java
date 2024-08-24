import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class fractionAS{
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            int length = s.length(), i=0;
            long den=1L; long num=0;
            List <Integer> numerator = new ArrayList<>();
            List <Integer>denominator = new ArrayList<>();
            List sign = new ArrayList<>();
            if(s.charAt(0)!='-'){
                sign.add('+');
            }
            else{
                sign.add('-');
                i=1;
            }
            for(;i<length;i++){
                numerator.add(s.charAt(i)-48);
                i+=2;
                denominator.add(s.charAt(i)-48);
                den = den * (s.charAt(i)-48);
                i++;
                if(i<length)
                    sign.add(s.charAt(i));
            }
            System.out.println(numerator);
            System.out.println(den);
            System.out.println(denominator);
            for(i = 0;i< numerator.size();i++){
                if(sign.get(i).equals('+'))
                    num = num + numerator.get( i) * den/denominator.get(i);
                else     
                    num = num - numerator.get( i) * den/denominator.get(i);
                    System.out.println(num);
            }
            // System.out.println(num);
            // System.out.println(den);
            long limit = num > den ? num:den;
           for( long l = limit/2L; l>1; l-- ){
                if(num%l==0 && den%l==0){
                    num=num/l;
                    den=den/l;
                }
                if(num==1)
                    break;
           }
            System.out.println(num+"/"+den);
        }
        catch(Exception E){

        }    

    }
}