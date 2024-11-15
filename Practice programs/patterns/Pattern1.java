import java.util.*;
public class Pattern1 {
//    1
//   232
//  34543
// 4567654     
    public static void main(String[] args) {
        int x=1,y;
        for(int i=0;i<4;i++){
            for(int j = 0;j<3-i;j++)
                System.out.print("*");
                int flag=0; y= i+1;
            for(int k = 1; k<=x;k++ ){
                System.out.print(y);
                if(flag==0){
                    if(y==x){
                        flag=1;
                        y--;
                    }
                    else   
                        y++;    
                }else  
                    y--;

            }
            x+=2;
            System.out.println("");   

        }
    }
}
    