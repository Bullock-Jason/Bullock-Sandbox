package Hibernate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author BULLOJP
 */
public class InsertPerson {
    
    
     public static void main(String[] args) {
        // This is where the code goes to insert data into the database
       Configuration cfg = new Configuration();
       //location of hibernation xml file with how to connect to database
       cfg.configure("hibernate.cfg.xml");
       SessionFactory sf = cfg.buildSessionFactory();
       Session session = sf.openSession();
       Transaction trans = session.beginTransaction();
       
       Person person = new Person();
       person.setId(4);
       person.setName("Jason");
       person.setEmail("Jason@byui.edu");
       person.setPhone("7184445454");
       //to save to database
       session.save(person);
       session.flush();
       trans.commit();
       session.close();
       
       //need to figure out database settings to get this to write
       
       
       
       
       
       
       
         
        
    }
}
