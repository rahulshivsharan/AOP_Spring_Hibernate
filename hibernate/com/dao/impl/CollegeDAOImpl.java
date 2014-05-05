/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.dao.impl;

import hibernate.com.dao.impl.CollegeDAO;
import hibernate.com.entity.College;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository("collegeDAOBean")
public class CollegeDAOImpl extends BaseDAOImpl<College> implements CollegeDAO<College> {
    
    public CollegeDAOImpl(){
        super(College.class);
    }

    @Override
    public List<College> addCollege(College c) throws Exception {
        this.save(c);
        List<College> collegeList = this.list();
        return collegeList;
    }

    @Override
    public List<College> deleteCollege(Integer collegeId) throws Exception {
        College obj = this.get(collegeId);
        this.delete(obj);
        List<College> collegeList = this.list();
        return collegeList;
    }

    @Override
    public List<College> updateCollege(College c) throws Exception {
        this.update(c);
        List<College> collegeList = this.list();
        return collegeList;
    }
}
