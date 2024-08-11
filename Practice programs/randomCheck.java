import java.util.*;
class randomCheck{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int length, num,i=0;
        num = sc.nextInt();  // 678 687 355 898
        char c; 
        // String[] once = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        // String[] tens ={"Ten","Twenty","Thirty", "Fourty", "Fifty", "Sixty","Seventy","Eighty","Ninety"};

        String[] once = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] nopl = {"Hundred", "Thousand", "Million", "Billion"};



        // String[] nopl = {"Thousand", "Million","Billion"};
        //String revNum = new StringBuilder(String.valueOf(num)).reverse().toString(); //
        //System.out.println("Reversed String is: "+ revNum);
        String revNum = new StringBuilder(String.valueOf(num)).toString();
        length = revNum.length(); // 12
        System.out.println("Length is: " + length);
        String finalString = "";
        int x = length %3;
        c=revNum.charAt(i);
        if(x==2){
            if(c=='1'){
                c=revNum.charAt(i+1);
                finalString = finalString.concat(teens[(c-'0')-1]);
            }
            else{
                finalString = finalString.concat(tens[(c-'0')-1]+" "+once[(c-'0')-1]+" ");   
            }
            i=2;  
        } 
        else if(x==1){
            finalString = finalString.concat(once[(c-'0')-1]+" ");
            i=1;
        }
        //c = revNum.charAt(i);
        int r=length/3; // 4
        System.out.println("r is " + r);
        x=3;
        for(; i< length;i++){
            c=revNum.charAt(i);
            System.out.println("Char at "+ i +"th positon is "+c);
            if(x==3){
                finalString = finalString.concat(once[(c-'0')-1]+" ");
                finalString = finalString.concat(nopl[0]+" ");
                x--;
                continue;

            }
            if(x==2){
                if(i==length-2){
                    if(c=='1'){
                        c=revNum.charAt(i+1);
                        finalString = finalString.concat(teens[(c-'0')-1]);
                        break;
                    }
                }
                finalString = finalString.concat(tens[(c-'0')-1]+" ");   
                x--;
                continue;
            }
            if(x==1){
                finalString = finalString.concat(once[(c-'0')-1]+" ");
                x--;
                x=3;
                if((r-1>=0)&&(i+2<length)){
                    finalString = finalString.concat(nopl[r-1]+" ");
                    r--;
                }
                continue;
            }
        }
        System.out.println(finalString);
    }
}