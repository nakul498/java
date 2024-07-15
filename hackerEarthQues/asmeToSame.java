import java.util.*;
class asmeToSame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            int length = sc.nextInt();
            sc.nextLine();
             char arr[];
             char arr2[];
            
            String input = sc.nextLine();
            arr = input.toCharArray();

            input = sc.nextLine();
            arr2 = input.toCharArray();

            int quesCounter = 0;
            
            for (int j=0;j<length;j++){
                if(arr[j]=='?')
                    quesCounter++;    
            }
            //System.out.println(quesCounter);
            boolean isMatched = true;
            for (int j = 0; j < length; j++) {
                boolean found = false;
                for (int k = 0; k < length; k++) {
                    if (arr2[j] == arr[k]) {
                        arr[k] = 0; // mark as used
                        found = true;
                        break;
                    }
                }
                
                if (!found) {
                    if(quesCounter == 0){
                        System.out.println("No");
                        isMatched = false;
                        break;
                    }
                    else {
                   //     System.out.println(arr[j]+ "   " + quesCounter);
                        quesCounter --;
                     }     
                }
            }
            
            if (isMatched) {
                System.out.println("Yes");
            }
        }
    }
}
