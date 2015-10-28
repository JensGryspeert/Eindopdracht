/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import models.EventDetails;
import models.Events_Registered;
import org.joda.time.DateTime;

/**
 *
 * @author joycee
 */
public class EventsRegisteredDAO extends BaseDAO{
    EntityManager em;
    public EventsRegisteredDAO() {
        em = emf.createEntityManager();
    }
    
    
    public List<Events_Registered> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Events_Registered> cq = cb.createQuery(Events_Registered.class);
        cq.from(Events_Registered.class);
        TypedQuery<Events_Registered> q = em.createQuery(cq);
        return q.getResultList();
    }

    public Events_Registered findById(int id) {
        return em.find(Events_Registered.class, id);
    }
    
    
    public void insertRegisteredUser(Events_Registered er) {
        em.getTransaction().begin();
        em.persist(er);
        em.getTransaction().commit();
    }

    public void updateRegisteredUser(Events_Registered er) {
        em.getTransaction().begin();
        em.getTransaction().commit();
    }

    public void deleteRegisteredUser(Events_Registered er) {
        em.getTransaction().begin();
        em.remove(er);
        em.getTransaction().commit();
    }

    @Override
    public void close() {
        if (em != null) {
            em.close();
            super.close();
        }
    }
    

}
