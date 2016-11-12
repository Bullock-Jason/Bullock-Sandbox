/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hib;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author BULLOJP
 */
public class Model {
     static void addPerson(Jason_Json addPerson){
        Session session = DBControl.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
       
        session.save(addPerson);
        transaction.commit();
        
      // session.flush();
       //session.close(); 
     }
  
}


