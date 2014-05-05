/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com;

import hibernate.com.entity.Student;
import hibernate.com.service.StudentService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {
    public static void main(String [] args){
        ApplicationContext ctx = null;
        StudentService studentService = null;
        List<Student> list = null;
        try{
            ctx = new ClassPathXmlApplicationContext("hibernate/resource/spring-config.xml");
            studentService = (StudentService) ctx.getBean("studentServiceBean");
            list = studentService.save(new Student(10, "Atif Aslam"));
            
            for(Student s : list){
                System.out.println(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
