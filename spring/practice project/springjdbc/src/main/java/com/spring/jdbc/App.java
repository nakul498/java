package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
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
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
//        Student student= new Student();
//        student.setCity("amritsar");
//        student.setId(221);
//        student.setName("moti");
//        int result = studentDao.insert(student);
//        System.out.println("student added "+result);
        
//        Student student = new Student();
//        student.setId(456);
//        student.setName("RAJ");
//        student.setCity("valsad");
//        int result = studentDao.change(student);
//        System.out.println("data changed "+result);
        
     Student student = new Student();
     student.setId(456);
     int result = studentDao.delete(student);
      System.out.println("data deleted "+result);
        
    }
}
