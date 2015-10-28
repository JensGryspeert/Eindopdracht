/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import models.*;
import org.joda.time.DateTime;

/**
 *
 * @author joycee
 */
public class AgendaDAO extends BaseDAO {

    EntityManager em;

    public AgendaDAO() {
        em = emf.createEntityManager();
    }

    public List<Agenda> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Agenda> cq = cb.createQuery(Agenda.class);
        cq.from(Agenda.class);
        TypedQuery<Agenda> q = em.createQuery(cq);
        return q.getResultList();
    }

    public Agenda findById(int id) {
        return em.find(Agenda.class, id);
    }
    
    public List<Agenda> showAgendaPointsAfterNow(){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Agenda> cq = cb.createQuery(Agenda.class);
        Root<Agenda> r = cq.from(Agenda.class);
        cq.where(cb.equal(r.get("dt"), DateTime.now()));
        
        TypedQuery<Agenda> q = em.createQuery(cq);
        
        return q.getResultList();
    }
    public void insertAgenda(Agenda ag) {
        em.getTransaction().begin();
        em.persist(ag);
        em.getTransaction().commit();
    }

    public void updateAgenda(Agenda ag) {
        em.getTransaction().begin();
        ag.setUpdatedAt(DateTime.now().toDate());
        em.getTransaction().commit();
    }

    public void deleteAgenda(Agenda ag) {
        em.getTransaction().begin();
        em.remove(ag);
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
