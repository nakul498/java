import java.io.*;
public class ques2 {
    /*
     * wap to define a class student with attributes name, cgpa and mobile . Store some student object in a file 
     * named as placement.txt
     * 
     */
    public static void main(String[] args) {
        Student s1 = new Student("Patrik", "O+", 43255425);
        Student s2 = new Student("Vivek", "A+", 5432523);
        Student s3 = new Student("Britk", "B", 65436543);
        try{
            FileOutputStream fout = new FileOutputStream("placement.txt");
            ObjectOutputStream oout= new ObjectOutputStream(fout);
            // they both are super class, child class so we can just handle io exception
            oout.writeObject(s1);
            oout.writeObject(s2);
            oout.writeObject(s3);

            oout.close();
        }catch(IOException e){
                System.out.println(e);
        }

    }
}
class Student implements Serializable{
    String name, cgpa;
    int mobNo;
    Student(String name, String cgpa, int mobNo){
        name = this.name;
        cgpa = this.cgpa;
        mobNo = this.mobNo;
    }
}
