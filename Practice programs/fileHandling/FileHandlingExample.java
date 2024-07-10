import java.io.File;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        // Specify the directory path
        String dirPath = "D:\\java\\Practice programs\\fileHandling\\files";
        // Specify the file path
        String filePath = dirPath + "\\example.txt";

        // Create a File object for the directory
        File directory = new File(dirPath);

        // Check if the directory exists and create if it doesn't
        if (!directory.exists()) {
            boolean dirCreated = directory.mkdirs();
            if (dirCreated) {
                System.out.println("Directory created successfully: " + directory.getAbsolutePath());
            } else {
                System.out.println("Failed to create directory: " + directory.getAbsolutePath());
                return;
            }
        } else {
            System.out.println("Directory already exists: " + directory.getAbsolutePath());
        }

        // Create a File object for the new file
        File file = new File(filePath);

        // Check if the file exists and create if it doesn't
        if (!file.exists()) {
            try {
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {
                    System.out.println("File created successfully: " + file.getAbsolutePath());
                } else {
                    System.out.println("Failed to create file: " + file.getAbsolutePath());
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file: " + file.getAbsolutePath());
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists: " + file.getAbsolutePath());
        }
    }
}
