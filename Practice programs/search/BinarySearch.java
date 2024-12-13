import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whole next element you want to find");
        int find = sc.nextInt();
        int left = 0, right = arr.length-1;
        int result =0;
        while(left <= right){
            System.out.println("left is "+arr[left]+" right is "+arr[right]);
            int mid = left + (right -left)/2;
            if(arr[mid]<find)
            left = mid+1;    
            else 
            right = mid-1;
                
        }
        System.out.println("finally left is "+arr[left]+" right is "+arr[right]+" result is "+result);

    }  
}
