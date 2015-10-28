/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.*;

/**
 *
 * @author joycee
 */
@Entity
@Table(name = "events_registered")
public class Events_Registered {
    @Id @GeneratedValue
    private int id;
    @Column(name = "max_aantal")
    private int max_aantal;
    @Column(name = "event_id")
    private int eventId;
    @Column(name = "agenda_id")
    private int agendaId;
    @Column(name = "userId")
    private int userId;

    public Events_Registered(int max_aantal, int eventId, int agendaId, int userId) {
        this.max_aantal = max_aantal;
        this.eventId = eventId;
        this.agendaId = agendaId;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMax_aantal() {
        return max_aantal;
    }

    public void setMax_aantal(int max_aantal) {
        this.max_aantal = max_aantal;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getAgendaId() {
        return agendaId;
    }

    public void setAgendaId(int agendaId) {
        this.agendaId = agendaId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
}
