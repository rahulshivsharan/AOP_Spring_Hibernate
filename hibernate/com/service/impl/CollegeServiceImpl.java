/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.service.impl;

import hibernate.com.dao.impl.CollegeDAO;
import hibernate.com.entity.College;
import hibernate.com.service.CollegeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;



@Service("collegeServiceBean")
public class CollegeServiceImpl implements CollegeService{

    @Autowired
    @Qualifier("collegeDAOBean")
    private CollegeDAO<College> dao;
    
    @Override
    public List<College> save(College c) throws Exception {
       return this.dao.addCollege(c); 
    }

    @Override
    public List<College> update(College c) throws Exception {
        return this.dao.updateCollege(c);
    }

    @Override
    public List<College> delete(Integer colleteId) throws Exception {
        return this.dao.deleteCollege(colleteId);
    }

    /**
     * @return the dao
     */
    public CollegeDAO<College> getDao() {
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(CollegeDAO<College> dao) {
        this.dao = dao;
    }
    
}
