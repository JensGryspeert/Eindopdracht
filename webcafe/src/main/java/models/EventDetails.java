/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import org.joda.time.DateTime;

/**
 *
 * @author joycee
 */
@Entity
@Table(name = "event_details")
public class EventDetails {
    /* Declaring Variables */

    @Id
    @GeneratedValue
    @Column(name = "id")
    int id;
    @Column(name = "title", length = 30)
    String title;
    @Column(name = "loc_img")
    String locImg;
    @Column(name = "adres")
    String adres;
    @Column(name = "datum")
    Date datum;
    @Column(name = "fee")
    long fee;
    
    /*@Column(name = "for_who")
     List<Tags> users*/
    @Column(name = "omschrijving")
    String omschrijving;
    
    @OneToMany(targetEntity = Users.class)
    private List<Users> userslist; 
    
    
    @Column(name = "created_at")
    Date createdAt;
    
    @Column(name = "updated_at")
    Date updatedAt;

    /* Constructor */
    public EventDetails(String title, String locImg, String adres, Date datum, long fee, String omschrijving) {
        this.title = title;
        this.locImg = locImg;
        this.adres = adres;
        this.datum = datum;
        this.fee = fee;
        this.omschrijving = omschrijving;
        this.createdAt = DateTime.now().toDate();
        this.updatedAt = DateTime.now().toDate();
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocImg() {
        return locImg;
    }

    public void setLocImg(String locImg) {
        this.locImg = locImg;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }


    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }


   

    
    
}
