import java.util.*;
class MostBeautiful2070{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[5][2];
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("length is"+arr.length);
        HashMap<Integer, Integer> beauty = new HashMap<>();
        // int i=0;
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<5; i++){
            if(beauty.contains(arr[i][0])){
                if(arr[i][1]> beauty.get(arr[[i][0]])){
                    beauty.put(arr[i][0], arr[i][1] );
                }
            }
            else 
                beauty.put(arr[i][0], arr[i][1] );
        }

       
    }
}