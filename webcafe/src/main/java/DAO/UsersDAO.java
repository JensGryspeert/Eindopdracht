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
public class UsersDAO extends BaseDAO{
EntityManager em;
    public UsersDAO(){
        em = emf.createEntityManager();
    }
    
    public List<Users> findAll(){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Users> cq = cb.createQuery(Users.class);
        cq.from(Users.class);
        TypedQuery<Users> q = em.createQuery(cq);
        return q.getResultList();
    }
    public Users findById(int id){
        return em.find(Users.class, id);
    }
    public void insertUser(Users user){
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }
    public void updateUser(Users user){
        em.getTransaction().begin();
        user.setUpdatedAt(DateTime.now().toDate());
        em.getTransaction().commit();
    }
    @Override
    public void close(){
        if(em!=null){
            em.close();
            super.close();
        }
    }    
}
