package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started......" );
        // spring jdbc -> jdbcTemplate
        //as now we created configration file, we are not using xml
        // ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");    
        // JdbcTemplate bean = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
        
        //CREATING DAO OBJECT
        StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
        
        //INSET DATA
//        Student student= new Student();
//        student.setCity("amritsar");
//        student.setId(221);
//        student.setName("moti");
//        int result = studentDao.insert(student);
//        System.out.println("student added "+result);
        
        //To UPDATE DATA
//        Student student = new Student();
//        student.setId(456);
//        student.setName("RAJ");
//        student.setCity("valsad");
//        int result = studentDao.change(student);
//        System.out.println("data changed "+result);

        //TO DELETE
//     Student student = new Student();
//     student.setId(256);
//     int result = studentDao.delete(student);
//      System.out.println("data deleted "+result);
        
//        //TO SELECT
//        Student student = studentDao.getStudent(222);
//        System.out.println(student);
        
       
  
        List<Student> students =  studentDao.getAllStudents();
        for ( Student s: students) {
        	System.out.println(s);
        }
    }
}
