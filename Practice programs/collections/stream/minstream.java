import java.util.*;
public class minstream {
    public static void main(String[] args) {

        // Create a list of integers 
        List <Integer> list = Arrays.asList(12,53,5);

        // Find the minimum value in the list using streams
        // The lambda expression
        Optional <Integer> min = list.stream().min((Integer a, Integer b) -> b - a);

         // Print the minimum value; 'min.get()' retrieves the value from the Optional
        System.out.println(min.get());
    }
}
