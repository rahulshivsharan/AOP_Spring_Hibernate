/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.com.dao.impl;

import hibernate.com.dao.impl.BaseDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public abstract class BaseDAOImpl<T> implements BaseDAO<T> {

    private Class<T> entityClass;
    
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    public BaseDAOImpl(Class<T> clazz) {              
          this.entityClass = clazz;  
    }

    /**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Criteria getCriteria() throws Exception{
        return this.currentSession().createCriteria(this.entityClass);
    }

    public Session currentSession() {
        return this.getSessionFactory().getCurrentSession();
    }

    public Query query(String query) {
        return this.currentSession().createQuery(query);
    }

    @Override
    public List<T> list() throws Exception{
        return this.getCriteria().list();
    }

    

    @Override
    public void save(T object) throws Exception {
        this.currentSession().save(object);
    }

    @Override
    public void update(T object) throws Exception {
        this.currentSession().update(object);
    }

    @Override
    public void delete(T object) throws Exception {
        this.currentSession().delete(object);
    }

    @Override
    public T get(Integer i) throws Exception {
        return (T) this.currentSession().get(entityClass, i);
    }
}
