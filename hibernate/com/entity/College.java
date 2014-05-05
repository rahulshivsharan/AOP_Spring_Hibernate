/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author rs69421
 */

@Entity
@Table(name = "COLLEGE_TBL")
public class College implements Serializable{
    
    @Id
    @Column(name = "COLID")
    private Integer collegeId;
    
    @Column(name = "COLNAME")
    private String collegeName;
    
    @OneToMany( orphanRemoval = false, 
                cascade = {CascadeType.ALL},
                targetEntity = Student.class,
                fetch = FetchType.LAZY,
                mappedBy = "college")
    private List<Student> students;

    /**
     * @return the collegeId
     */
    public Integer getCollegeId() {
        return collegeId;
    }

    /**
     * @param collegeId the collegeId to set
     */
    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    /**
     * @return the collegeName
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * @param collegeName the collegeName to set
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    @Override
    public int hashCode(){
        int myHashCode = this.getCollegeId() * 17;
        return myHashCode;
    }
    
    @Override
    public boolean equals(Object o){
        boolean flag = false;
        College myCollege = null;
        
        if(o instanceof College){
            myCollege = (College) o;            
            if(myCollege.getCollegeId() == this.getCollegeId()){
                flag = true;
            }
        }
        return flag;
    }
    
    @Override
    public String toString(){
        StringBuffer strb = new StringBuffer();
        
        strb.append("College Id : ").append(this.collegeId)
            .append("College Name : ").append(this.collegeName);
        
        return strb.toString();
    }
}
