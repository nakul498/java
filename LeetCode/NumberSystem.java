import java.util.*;
public class NumberSystem {
    public static void main(String[] args) {
        // Step 1: Enter an int value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        
        String[] once = {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"","Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] nopl = {"Hundred", "Thousand", "Million", "Billion"};

        String finalString="";
        char c;
        int x,d;
        // Step 2: Convert that value into a string
        String strValue = String.valueOf(intValue);
        
        // Step 4: Declare a variable which is equal to length % 3
        int len = strValue.length();
        int remainder = len % 3;
        // Array to hold the split strings
        String[] strArray;
        d= len/3;
        // Determine the size of the array
        if (remainder == 0) {
            strArray = new String[d];
        } else {
            strArray = new String[(d) + 1];
            d=d+1;
        }
        //432 432 432 234
        // Step 4a: If remainder == 2, pick first two elements and put it in String array
        int index = 0;
        int startIndex = 0;
        if (remainder == 2) {
            strArray[index++] = strValue.substring(0, 2);
            startIndex = 2;
        }
        // Step 4b: If remainder == 1, pick first element and put it in String array
        else if (remainder == 1) {
            strArray[index++] = strValue.substring(0, 1);
            startIndex = 1;
        }
        System.out.println("step 4 completed with array ");
        
        // Step 5: Put all the rest of elements of string into String array in sets of 3
        for (int i = startIndex; i < len; i += 3) {
            strArray[index++] = strValue.substring(i, i+3);
        }
        System.out.println("array value filled");
        for(String s: strArray){
            //c=s.charAt(0);
            // if((cycle ==1)||cycle == strArray.length){
                s=s.replaceFirst("^0+(?!$)", "");
                x = s.length();
                if(x==3){
                    if(s.charAt(1)=='1' ){
                        finalString = finalString.concat(once[(s.charAt(0)-'0')]+" Hundred "+teens[(s.charAt(2)-'0')]);
                    }
                    else{
                        finalString = finalString.concat(once[(s.charAt(0)-'0')]+" Hundred "+tens[(s.charAt(1)-'0')]);
                        if(s.charAt(1)=='0')
                            finalString = finalString.concat(once[(s.charAt(2)-'0')]);
                        else
                            finalString = finalString.concat(" "+once[(s.charAt(2)-'0')]);     
                    }       
                }
                else if(x==2){
                    if(s.charAt(1)=='0'){
                        finalString = finalString.concat(tens[(s.charAt(0)-'0')]+" ");
                    }
                    else if(s.charAt(0)=='1'){
                        finalString = finalString.concat(teens[(s.charAt(1)-'0')]+" ");
                    }
                    else{
                        finalString = finalString.concat(tens[(s.charAt(0)-'0')]+" "+once[(s.charAt(1)-'0')]+" ");   
                    }
                } 
                else if(x==1){
                    if(s.charAt(0)=='0'&& finalString.isEmpty())
                        finalString = finalString.concat("Zero");
                    else if(s.charAt(0)!='0')   
                        finalString = finalString.concat(once[(s.charAt(0)-'0')]+" ");
                }
    
                if(x==1 && s.charAt(0)=='0'){
                    d--;
                    continue;
                }    

                if(d>1){
                    
                    finalString=finalString.trim();
                    finalString = finalString.concat(" "+nopl[(d--)-1]+" ");
                }    
            }


        System.out.println(finalString);
        
        // Close the scanner
        scanner.close();
    }
       
}