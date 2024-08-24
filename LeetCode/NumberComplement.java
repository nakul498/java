import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberComplement {
 
    public static void main(String args[]) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            int binaryNum = convertToBinary(num);
            int finalNum = BinaryToNo(binaryNum);
            System.out.println(finalNum);
        }catch(Exception E){
            
        }
    }
    static int convertToBinary(int num){
        int r=0; StringBuilder bN= new StringBuilder();
        while(num!=0){
            r=num%2;
            if(r==0)
                r=1;
            else
                r=0;    
            bN = bN.append(r);
            num=num/2;
        }
        bN =bN.reverse();
        System.out.println(bN);
        return Integer.parseInt(bN.toString());
    }
    static int BinaryToNo(int binaryNum){
        int r=0; double num=0; 
        while(binaryNum!=0){

           num= num + (Math.pow(2, r))*(binaryNum%10);
           r++;
           binaryNum = binaryNum/10;
        }
        return (int)num;
    }
}

