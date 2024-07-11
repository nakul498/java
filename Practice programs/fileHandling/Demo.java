import java.io.*;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        File f = new File("D:\\java\\Practice programs\\fileHandling\\files\\K19RT.txt");
        File f2 = new File("D:\\java\\Practice programs\\fileHandling\\files\\pdf");
        File f3= new File("abc\\K19TS.txt");
        /* here f has a absolute path and f3 has a related path therefor f will be created
         * in d\java\practice program\filehandling\files and f3  will be created whereever we are working currently
         */
        System.out.println(f3.getParent()); // this will give parent of f3

        System.out.println(f.getName()); // this will give last component in this case K19RT.txt

        System.out.println(f.getPath()); // it will give whatever address we pass in the constructor either Absolute or relative path

        System.out.println(f3.getAbsoluteFile()); // gives the absolute path even, we pass relative path in the constructor

        System.out.println(f.lastModified()); // it gives us time difference in milli second with unit time, result comes in unix time
    
        System.out.println(new Date(f.lastModified())); // to convert unix date into normal we can use this constructor
    
        System.out.println(new Date(f2.lastModified()));  // if file dont exist it will five Thu Jan 01 05:30:00 IST 1970 as unix time calculate from this time, time difference in milli second

        System.out.println(f.length());    
    }
}
