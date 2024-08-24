import bjava.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            int target = Integer.parseInt(br.readLine());
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            String str[] = input.split(" ");
            int length = str.length;
            int arr[] = new int[length];
            int i = 0;
            for (String s : str) {
                arr[i++] = Integer.parseInt(s);
            }
            Arrays.sort(arr);
            System.out.println("now array is ");
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
            findCombinations(arr, target, 0, list, result);
            for (List<Integer> l : result) {
                System.out.println(l);
            }
        } catch (Exception io) {
            System.out.println("error" + io);
        }
    }

    private static void findCombinations(int[] arr, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) continue; // Skip duplicates
            if (arr[i] > target) break;
            current.add(arr[i]);
            findCombinations(arr, target - arr[i], i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}