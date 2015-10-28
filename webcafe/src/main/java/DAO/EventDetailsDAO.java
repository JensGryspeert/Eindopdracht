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
import models.*;
import org.joda.time.DateTime;

/**
 *
 * @author joycee
 */
public class EventDetailsDAO extends BaseDAO {

    EntityManager em;

    public EventDetailsDAO(EntityManager em) {
        em = emf.createEntityManager();
    }
    
    public List<EventDetails> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<EventDetails> cq = cb.createQuery(EventDetails.class);
        cq.from(EventDetails.class);
        TypedQuery<EventDetails> q = em.createQuery(cq);
        return q.getResultList();
    }

    public EventDetails findById(int id) {
        return em.find(EventDetails.class, id);
    }

    public List<EventDetails> findFirstFive() {
        TypedQuery<EventDetails> qr = em.createQuery("SELECT ed.id, ed.title, ed.locImg, ed.adres, ed.datum, ed.fee, ed.omschrijving, ed.userId, ed.agendaId, ed.createdAt, ed.updatedAt FROM EventDetails ed", EventDetails.class).setMaxResults(5);
        List<EventDetails> result = qr.getResultList();
        return result;
    }

    public void insertEvent(EventDetails ed) {
        em.getTransaction().begin();
        em.persist(ed);
        em.getTransaction().commit();
    }

    public void updateEvent(EventDetails ed) {
        em.getTransaction().begin();
        ed.setUpdatedAt(DateTime.now().toDate());
        em.getTransaction().commit();
    }

    public void deleteEvent(EventDetails ed) {
        em.getTransaction().begin();
        em.remove(ed);
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
