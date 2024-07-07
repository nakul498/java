import java.util.*;
public class arrrayClone {
    public static void main(String args[]){
        int[]arr = {1,2,3,4,5};
        int[] arr2 = arr;
        arr [2]=45; // any changes in arr2 will make changes in arr also as now both array are reffering to same 
                    // index, to clone array we use clone () eg
        arr2 = arr.clone();
        arr2 [3]= 122; //this will not impact arr now           
        for(int x: arr){
        System.out.println(x);
        }

    }
}
