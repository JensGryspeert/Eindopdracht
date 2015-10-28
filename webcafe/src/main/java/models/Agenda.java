/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import javax.persistence.*;
import org.joda.time.DateTime;

/**
 *
 * @author joycee
 */
@Entity
@Table(name = "Agenda")
public class Agenda {
    /* Declaring Variables */
    @Id @GeneratedValue
    @Column(name="id")
    int id;
        
    @ManyToOne(optional = false)
    @JoinColumn(name = "event_detail_id")
    private EventDetails eventdetails;
    
    @Column(name="beg_uur")
    Date begUur;
    @Column(name="eind_uur")
    Date eindUur;
    @Column(name="topic")
    String topic;
    @Column(name="omschr")
    String omschr;
    @Column(name="created_at")
    Date createdAt;
    @Column(name="updated_at")
    Date updatedAt;
    
    /* Constructor */

    public Agenda( Date begUur, Date eindUur, String topic, String omschr) {
        this.begUur = begUur;
        this.eindUur = eindUur;
        this.topic = topic;
        this.omschr = omschr;
        this.createdAt = DateTime.now().toDate();
        this.updatedAt = DateTime.now().toDate();
    }
    
    /* Getters & Setters */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getBegUur() {
        return begUur;
    }

    public void setBegUur(Date begUur) {
        this.begUur = begUur;
    }

    public Date getEindUur() {
        return eindUur;
    }

    public void setEindUur(Date eindUur) {
        this.eindUur = eindUur;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getOmschr() {
        return omschr;
    }

    public void setOmschr(String omschr) {
        this.omschr = omschr;
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

