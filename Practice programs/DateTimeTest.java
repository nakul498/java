import java.time.*;
import java.util.*;
public class DateTimeTest {
    static Date d = new Date();
    public static void main(String args[]){
       LocalDate localDate = LocalDate.now();
       LocalTime localTime = LocalTime.now();
       String Date = "2000-04-21";
       LocalDate parsingDate = LocalDate.parse(Date);
       LocalDate ofTest = LocalDate.of(2000, 5, 11);
        System.out.println("date is " + d);
        System.out.println("new Local date  is : "+ localDate);
        System.out.println("new Local time  is : "+ localTime);
        System.out.println(parsingDate);
        System.out.println(ofTest);
    }
}
