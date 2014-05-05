/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.dao;

import java.util.List;


public interface CollegeDAO<College> extends BaseDAO<College> {

    List<College> addCollege(College c) throws Exception;

    List<College> deleteCollege(Integer collegeId) throws Exception;

    List<College> updateCollege(College c) throws Exception;
}
