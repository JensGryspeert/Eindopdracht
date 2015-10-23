/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author joycee
 */
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kaspercools
 *
 */
public abstract class BaseDAO {

    protected static EntityManagerFactory emf;

    public BaseDAO() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("be.hitek.eindopdracht.jens_webcafe_jar_0.0.1PU");
        }
    }
    
    public void close(){
        if(emf!=null){
            emf.close();
            emf=null;
        }
    }
}

