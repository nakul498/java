import java.util.*;
public class CircluarString2490 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        int l = words.length;
        for(int i =0 ; i< l-1;i++){
            if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)){
                System.out.println("not a circular String");
                return;
            }
        }
        if(words[l-1].charAt(words[l-1].length()-1)  == words[0].charAt(0))
            System.out.println("Circular String");
        else 
            System.out.println("not a circular String");
    }
}
