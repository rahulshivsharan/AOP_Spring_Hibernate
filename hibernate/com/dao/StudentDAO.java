/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.dao;

import java.util.List;


public interface StudentDAO<Student> extends BaseDAO<Student> {

    List<Student> addStudent(Student student) throws Exception;

    List<Student> deleteStudent(Integer studentId) throws Exception;

    List<Student> updateStudent(Student student) throws Exception;
}
