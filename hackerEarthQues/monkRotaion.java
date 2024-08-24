import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class monkRotaion {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while(t!=0){
            t--;
            StringTokenizer sr = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(sr.nextToken());
            int k = Integer.parseInt(sc.nextToken())%n;
            int arr[]= new int[n];
            st = br.readLine();
            for(int i=0;i<j;i++){
                arr[i] = sc.nextInt();  
            }
            for(int i: arr){
                System.out.print(i+" ");
            }
        }

    }
}
