import java.util.*;

public class genericClass {

 public static void main(String[] args) {
    TestingGenerics<Integer> t = new TestingGenerics<Integer>(100);
    System.out.println(t.getObject());
 }   

}
class TestingGenerics <T> {
    T obj;
    TestingGenerics (T obj){
        this.obj = obj;
    }
    public T getObject(){
        return obj;
    } 
}