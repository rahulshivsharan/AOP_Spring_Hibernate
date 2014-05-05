/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.service;

import hibernate.com.entity.College;
import java.util.List;


public interface CollegeService {

    List<College> save(College c) throws Exception;

    List<College> update(College c) throws Exception;

    List<College> delete(Integer colleteId) throws Exception;
}
