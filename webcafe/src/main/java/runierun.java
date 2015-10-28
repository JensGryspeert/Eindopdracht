/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import models.*;
import DAO.*;

/**
 *
 * @author joycee
 */
public class runierun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // aanmaken van connectie
        UsersDAO userdao = new UsersDAO();
        // Toevoegen van een user
        //Users user1 = new Users("test", "testiie", "19940629", "Hitek", "Directeur", "/../img/lekker.jpg", "jensgryspeert@mail.com", "passwoord", true);
        //userdao.insertUser(user1);
        
 
        // Updaten van een user
        //Users user1 = userdao.findById(1);
        //user1.setName("Mario");
        //user1.setForename("Van Corselis");
        //userdao.updateUser(user1);
        
        // sluiten van connectie
        userdao.close();
    }
    
}
