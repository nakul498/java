import java.io.*;
import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        System.out.println("initiating cleaner\nEnter the path of folder you want to clean");
        // in this program we are creating a folder according to extension and make groups of files in it.
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File f = new File(path);
        File[] list = f.listFiles();

        if (list == null) {
            System.out.println("The specified path does not exist or is not a directory.");
            return;
        }

        for (File a : list) {
            if (a.isFile()) { // Check if it's a file
                String name = a.getName();
                String[] parts = name.split("\\.");
                if (parts.length > 1) {
                    String extension = parts[parts.length - 1];
                    System.out.println(extension);
                    // Create a directory for the extension if it doesn't exist
                    File dir = new File(path + File.separator + extension);
                    if (!dir.exists()) {
                        dir.mkdir();
                    }
                    // Move the file to the directory
                    a.renameTo(new File(dir + File.separator + name));
                }
            }
        }

        System.out.println("Cleaning complete.");
    }
}
