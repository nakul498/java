import java.util.*;
class randomCheck{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int arr[] = {0,1,2,3,4};
        int arr2[] = new int [5];
        System.out.println(arr[1]);
        System.out.println(arr2[3]);
        System.out.println(arr.length);
        System.out.println("enter values of your array " );
        for (int i = 0; i<5;i++){
            System.out.print(i + " - " );
            arr[i]= sc.nextInt();
        }
        // for (int i = 0; i<5;i++){
        //     System.out.println(arr[i]);
           
        // }
        for (int arr3 : arr){
            System.out.println(arr3);
        }
    }
}