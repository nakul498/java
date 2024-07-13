import java.io.File;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        // Creating File objects
        File f = new File("D:\\javaPractice programs\\fileHandling\\files\\test.txt");
        File f2 = new File("D:\\javaPractice programs\\fileHandling\\files\\pdf");
        File f3 = new File("D:\\javaPractice programs\\fileHandling\\files\\k19.txt");
        File f4 = new File("BELLO");

        // Check if file f4 exists
        System.out.println("Checking file: " + f4.getAbsolutePath());
        if (f4.exists()) {
            System.out.println("File is present");
        } else {
            System.out.println("File is not present");
        }

        // Check if file f exists
        try {
            System.out.println("Checking file: " + f.getAbsolutePath());
            System.out.println("Canonical path: " + f.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (f.exists()) {
            System.out.println("f exists");

            // Check if f is a directory
            if (f.isDirectory()) {
                System.out.println("It is a directory");
            }
            // Check if f is a file
            else if (f.isFile()) {
                System.out.println("It is a file");
            }
        } else {
            System.out.println("f does not exist");
        }
    }
}
