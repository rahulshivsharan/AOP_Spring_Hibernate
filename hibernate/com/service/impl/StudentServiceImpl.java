/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.service.impl;

import hibernate.com.dao.impl.StudentDAO;
import hibernate.com.entity.Student;
import hibernate.com.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("studentServiceBean")
public class StudentServiceImpl implements StudentService{

    @Autowired
    @Qualifier("studentDaoBean")
    private StudentDAO<Student> dao;
    
    @Override
    public List<Student> save(Student student) throws Exception {
        return dao.addStudent(student);
    }

    @Override
    public List<Student> delete(Integer studentId) throws Exception {
        return dao.deleteStudent(studentId);
    }

    @Override
    public List<Student> update(Student student) throws Exception {
        return dao.updateStudent(student);
    }

    /**
     * @return the dao
     */
    public StudentDAO<Student> getDao() {
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(StudentDAO<Student> dao) {
        this.dao = dao;
    }
    
}
