import java.util.*;
public class InterfaceTest {
    //interface donot have constructors, this is one of the difference between abstract class and interfaces
    public static void main(String[] args) {
        System.out.println("hi");
    }
}

class LPU implements ACICT, UGC, StatTest {
    public void conduct_interface(){

    }
    public void take_Admission(){

    }
}

interface ACICT {
    int max_sub= 40;
    void conduct_interface();
    
}
interface StatTest{
    static void test(){
        System.out.println("Static method in StatTest interface");
    }
}

interface UGC {

    void take_Admission();
}
