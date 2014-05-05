/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author rs69421
 */

@Entity
@Table(name = "Student_tbl")
public class Student  implements Serializable{
    
    public Student(){}
    public Student(Integer id, String studentName){
        this.studentId = id;
        this.studentName = studentName;
    }
    
    @Id
    @Column(name = "stId")
    private Integer studentId;
    
    @Column(name = "stName")
    private String studentName;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = College.class)
    @JoinColumn(name = "COLLEGEID")
    private College college;

    /**
     * @return the studentId
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the college
     */
    public College getCollege() {
        return college;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(College college) {
        this.college = college;
    }
    
    @Override
    public int hashCode(){
        int myHash = this.studentId.intValue() * 17; 
        return myHash;
    }
    
    @Override
    public boolean equals(Object o){
        boolean flag = false;
        Student myStudent = null;
        
        if(o instanceof Student){
            myStudent = (Student) o;
            if(myStudent.getStudentId() == this.getStudentId()){
                flag = true;
            }
        }
        
        return flag;
    }
    
    @Override
    public String toString(){
        StringBuffer strb = new StringBuffer();
        
        strb.append(" Student Id : ").append(this.studentId).append("\n")
            .append(" Student Name : ").append(this.studentName);
            
        return strb.toString();
    }
}
