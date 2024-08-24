import java.util.Scanner;

public class IntegerToString {

    private static final String[] ONES = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] TEENS = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        String words = convertToWords(number);
        System.out.println(words);
    }

    private static String convertToWords(int number) {
        if (number == 0) return "Zero";

        StringBuilder words = new StringBuilder();
        int index = 0;
        
        while (number > 0) {
            int chunk = number % 1000;
            if (chunk != 0) {  
                String chunkWords = convertChunk(chunk);
                words.insert(0, chunkWords + THOUSANDS[index] + " ");
            }
            number /= 1000;
            index++;
        }

        return words.toString().trim();
    }

    private static String convertChunk(int number) {
        StringBuilder chunkWords = new StringBuilder();

        if (number >= 100) {
            chunkWords.append(ONES[number / 100]).append(" Hundred ");
            number %= 100;
        }

        if (number >= 20) {
            chunkWords.append(TENS[number / 10]).append(" ");
            number %= 10;
        } else if (number >= 10) {
            chunkWords.append(TEENS[number - 10]).append(" ");
            return chunkWords.toString();
        }

        if (number > 0) {
            chunkWords.append(ONES[number]).append(" ");
        }

        return chunkWords.toString();
    }
}
