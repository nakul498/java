import java.util.*;
public class CountFairPair2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10]; 
        for(int i =0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter lower limit: ");
        int lower = sc.nextInt();
        
        System.out.print("enter upper limit: ");
        int upper = sc.nextInt();
        Arrays.sort(arr);
        int  count=0;
        for(int i=0;i<arr.length;i++){
            int start = findStart(arr, i, lower, upper);
            int end = findEnd(arr, i, lower,upper);
           // System.out.print(start+" ");
              // If numstart and numend are valid positions, add the range count
              if (start != -1 && end != -1 && end >= start) {
                count += end - start + 1;
            }
        }
        System.out.print(count+" ");
        // for(int x: arr){
        //     System.out.print(x+" ");
        // }

    }
    static int findStart(int arr[], int i, int lower, int upper){
        int start = i+1;
        int result=-1;
        int end = arr.length-1;
        int sum = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            sum = arr[i]+ arr[mid];
            if(sum<=upper){
                if(sum>=lower)
                    result = mid;
                end = mid -1 ;    

            }else   
                start = mid+1;
                
        }
        return result;
    }
    static int findEnd(int arr[], int i, int lower, int upper){
        int start=i+1;
        int result=-1;
        int end = arr.length-1;
        int sum = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            sum = arr[i]+arr[mid];
            if(sum<=upper){
                if(sum>=lower)
                    result = mid;
                start=mid+1;

            }else
                end = mid-1;
        }
        return end;
    }
}
