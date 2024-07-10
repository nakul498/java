import java.util.*;
public class lambdaTest {
    public static void main(String[] args) {
        Test ob= (x,y) -> System.out.println("x+y =" +(x+y));
         // Call the add method
         ob.add(5, 10);
    }
}
@FunctionalInterface
interface Test {
    void add(int x, int y);
}
//below is code without lambda
// import java.util.*;

// // Define a functional interface with a single abstract method
// @FunctionalInterface
// interface Test {
//     void add(int x, int y);
// }

// // Create a named class that implements the Test interface
// class TestImplementation implements Test {
//     @Override
//     public void add(int x, int y) {
//         System.out.println("x + y = " + (x + y));
//     }
// }

// public class LambdaTest {
//     public static void main(String[] args) {
//         // Create an instance of the named class
//         Test ob = new TestImplementation();
        
//         // Call the add method on the instance
//         ob.add(5, 10);
//     }
// }
