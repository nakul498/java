import java.util.*;
abstract class Student{
    void getResult(){
        System.out.println("result method in student is called ");
    }    
    Student() {
        System.out.println("studnet constructor is called ");
    }   
}
// public class abstractClassCheck1{
//     public static void main(String args[]){
//         Student s = new Student();
//         s.getResult();
//     }
// }
// we cannot make object of abstract class so we need to inherit and use like this
public class AbstratClassCheck2 extends Student{
    public static void main(String args[]){
        AbstratClassCheck abstractClassCheck = new AbstratClassCheck();
        abstractClassCheck.getResult();
    }
}
