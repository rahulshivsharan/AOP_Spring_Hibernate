/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.service;

import hibernate.com.entity.Student;
import java.util.List;


public interface StudentService {

    List<Student> save(Student student) throws Exception;

    List<Student> delete(Integer studentId) throws Exception;

    List<Student> update(Student student) throws Exception;
}
