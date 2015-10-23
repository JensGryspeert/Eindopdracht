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
@Table(name = "Users")
public class Users {
    
    /* Declaring of variables */
    @Id @GeneratedValue
    @Column(name = "id")
       private int id;
    @Column(name = "name")
        private String name;
    @Column(name = "forename")
        private String forename;
    @Column(name = "birthdate")
        private String birthdate;
    @Column(name = "firm")
        private String firm;
    @Column(name = "function")
        private String function;
    @Column(name = "photo")
        private String photo;
    @Column(name = "email")
        private String email;
    @Column(name = "password")
        private String password;
    @Column(name = "loggedIn")
        private boolean loggedIn;
    @Column(name = "createdAt", columnDefinition = "DateTime")
        private Date createdAt;
        
    @Column(name = "updatedAt", columnDefinition = "DateTime")
        private Date updatedAt;
    
   
    /* Constructor */
    public Users(String name, String forename, String birthdate, String firm, String function, String photo, String email, String password, boolean loggedIn){
        this.name = name;
        this.forename = forename;
        this.birthdate = birthdate;
        this.firm = firm;
        this.function = function;
        this.photo = photo;
        this.email = email;
        this.password = password;
        this.loggedIn = loggedIn;
        this.createdAt =  DateTime.now().toDate();
        this.updatedAt = DateTime.now().toDate();
    }
    
    public Users(){
        
    }
    /* Getters and Setters */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    
    
}
