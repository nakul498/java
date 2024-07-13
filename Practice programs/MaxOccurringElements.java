import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurringElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        System.out.println("Enter the number of elements:");
        int numElements = sc.nextInt();
        sc.nextLine(); // Consume the newline character after nextInt()

        // Read the elements
        System.out.println("Enter the elements separated by spaces:");
        String[] sArray = sc.nextLine().split(" ");
        
        // Create a map to store the count of each integer
        Map<Integer, Integer> countMap = new HashMap<>();

        // Parse each string token to an integer and update the count in the map
        for (String s : sArray) {
       
            int number = Integer.parseInt(s);
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        // Find the maximum value in the countMap
        int maxCount = 0;
        for (int count : countMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Count the number of keys with the maximum value
        int maxCountKeys = 0;
        for (int count : countMap.values()) {
            if (count == maxCount) {
                maxCountKeys++;
            }
        }

        // Print the result
        System.out.println(maxCountKeys);
    }
}
