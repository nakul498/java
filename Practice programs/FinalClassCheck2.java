import java.util.*;
final class Student{
    void getResult(){
        System.out.println("result method in student is called ");
    } 
    Student() {
        System.out.println("studnet constructor is called ");
    }   
}
public class FinalClassCheck2{
    public static void main(String args[]){
        Student s = new Student();
        s.getResult();
    }
}
// we cannot inherit Final class
// public class FinalClassCheck2 extends Student{
//     public static void main(String args[]){
//         FinalClassCheck2 finalClassCheck2 = new FinalClassCheck2();
//         finalClassCheck2.getResult();
//     }
// }

