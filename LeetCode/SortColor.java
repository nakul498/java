import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        Arrays.sort(arr);
        for(int i = 0 ; i< length ;i++){
            arr[i]= sc.nextInt();
        } 
        List<Integer> list0=new ArrayList<Integer>();
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
   //     List<Integer> list3=new ArrayList<Integer>();
        for(int i = 0; i< length; i++){
            if(arr[i]==0){
                list0.add(0);
            }
            if(arr[i]==1){
                list1.add(1);
            }
            if(arr[i]==2){
                list2.add(2);
            }

        }
        list0.addAll(list1);
        list0.addAll(list2);
        list0.g
        System.out.println(list0);
        sc.close();
    }
}
