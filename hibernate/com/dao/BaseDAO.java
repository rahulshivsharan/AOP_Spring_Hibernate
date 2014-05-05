/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.dao;

import java.util.List;


public interface BaseDAO<T> {

    void save(T entity) throws Exception;

    void update(T entity) throws Exception;

    void delete(T entity) throws Exception;

    List<T> list() throws Exception;

    T get(Integer i) throws Exception;
}
