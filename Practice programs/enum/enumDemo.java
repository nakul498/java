import java.util.*;
enum Subject{
    CSE310("Ravi",6), INT305("vivi",67), MTH405("kero");
    int credit; String teacher;
    {
        System.out.println("Annom 1");
    }
    static{
        System.out.println("hello i am static");
    }
    Subject(String name, int cred){
        teacher= name;
        credit = cred;
        System.out.println("Annom 2");
    }
    Subject(String name){
        teacher= name;
        System.out.println("Annom 3");
    }
    void print(){
        System.out.println(teacher + "\t" + credit);
      
    }
    
}
public class enumDemo {
    public static void main(String args[]){
        Subject [] sub = Subject.values();
        for ( Subject s : sub){
            System.out.print(s +" ");
            s.print();
        }
        System.out.println(Subject.INT305.ordinal());
        System.out.println(Subject.valueOf("MTH405"));
    }
}
/*
 * anonymus block and static block are allowed in enum.
 * in Class, first class is loaded then static members are created and then main is ran, if 
 * object reference is created then anonymus and custructor is called but here in enum
 * static block is ran at end and anonymus and custructor is created first.
 */