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
            for(;i<length;i++){
                if(s.charAt(0)=='-'){
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
                    num=num*sign;
                if(s.charAt(i)=='/')
                    i++;
                while(i<length && Character.isDigit(s.charAt(i))){                                                                                                                                                                                                                     
                    den=den*10+(s.charAt(i)-'0');
                    i++;
                }
             //   System.out.println("/");
                System.out.println(num+"/"+den);
            }
        }
        catch(Exception E){
            System.out.println(E);
        }
    }   
}
