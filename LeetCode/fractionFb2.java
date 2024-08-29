import java.io.BufferedReader;
import java.io.InputStreamReader;

public class fractionFb2 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            int i=0,num=0, den=0,sign=0;
            int length = s.length();
               // System.out.println("before loop");
            int fnum = 0, fden = 1;   
            for(;i<length;i++){
                num=0; den=0;
                if(s.charAt(i)=='-'){
                    sign = -1;
                    i++;
                }
                else 
                    sign = +1;
                num=0;
              //  System.out.println("hi");
                while(i<length && Character.isDigit(s.charAt(i))){
                    num=num*10+(s.charAt(i)-'0');
                //    System.out.println(s.charAt(i)-'0'+"  "+num);
                    i++;
                }
                    System.out.println(sign);
                    num=num*sign;
                    System.out.println(num);
                if(s.charAt(i)=='/')
                    i++;
                while(i<length && Character.isDigit(s.charAt(i))){                                                                                                                                                                                                                     
                    den=den*10+(s.charAt(i)-'0');
                    i++;
                } 
                if(!Character.isDigit(s.charAt(i-1))){
                    i--;
                }
                fnum = fnum * den + (num*fden);
                fden = fden * den;
             //   System.out.println("/");
                System.out.println(fnum+"/"+fden);
            }
            int gcf = gcf(fnum, fden);
            //System.out.println(gcf);
             fnum= fnum/gcf;
             fden = fden/gcf;
             System.out.println(fnum+"/"+fden);

        }
        catch(Exception E){
            System.out.println(E);
        }
    }
    static int gcf(int a, int b){
            
        if (b == 0) {
            return a;
        }
        return gcf(b, a % b);
    }
    // static int gcf(int a, int b){
    //     int temp;
    //     while(a%b!=0){
    //         temp=a%b;
    //         a=b;
    //         b=temp;
    //     }
    //     return b;
    // }
}
