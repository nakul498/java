import java.io.*;
import java.util.*;
public class writeFile {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try{
        PrintWriter pw = new PrintWriter("D:\\java\\Practice programs\\fileHandling\\files\\write.txt");
        System.out.println("enter name");
        String name = sc.nextLine();
        pw.print(name+" ");
        System.out.println("enter mobile no");
        Long mob = sc.nextLong();
        pw.print(mob);
        pw.close();
       }catch(Exception e){
            System.out.println(e);
       }
    }
}
