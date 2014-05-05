/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.dao;

import hibernate.com.dao.impl.StudentDAO;
import hibernate.com.entity.Student;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository("studentDaoBean")
public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO<Student> {

    public StudentDAOImpl(){
        super(Student.class);
    }
    
    @Override
    public List<Student> addStudent(Student student) throws Exception {
        this.save(student);
        List<Student> studentList = this.list();
        return studentList;
    }

    @Override
    public List<Student> deleteStudent(Integer studentId) throws Exception {
        Student object = this.get(studentId);
        this.delete(object);
        List<Student> studentList = this.list();
        return studentList;
    }

    @Override
    public List<Student> updateStudent(Student student) throws Exception {
        this.update(student);
        List<Student> studentList = this.list();
        return studentList;
    }
}
