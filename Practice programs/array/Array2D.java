import java.util.*;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]);
        }
        for(int j=0;j<arr[0].length;j++){
            System.out.println(arr[0][j]);
        }
    }
}
