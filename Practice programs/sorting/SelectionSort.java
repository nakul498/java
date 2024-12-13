import java.util.*;
public class SelectionSort {
    int arr[]={3,2,5,6,4,1,7};
    for(int i=0; i< 7;i++){
        int min =arr[i];
        for(int j=i+1;j<7;j++){
            if(arr[j]<arr[i]){
                min= j;
            }

        }
        arr[i] = arr[min];
    }
}
