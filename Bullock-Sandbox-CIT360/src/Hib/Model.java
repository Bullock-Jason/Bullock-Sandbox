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
    
    static void addUser(DB_jason_user addUser){
        Session session = DBControl.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
       
        session.save(addUser);
        transaction.commit();
    }
     static void addPerson(DB_jason_json addPerson){
        Session session = DBControl.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
       
        session.save(addPerson);
        transaction.commit();
        
      // session.flush();
       //session.close(); 
     }
   
     static List<DB_jason_json> queryWeatherStatsFromDB() {
		Session session = DBControl.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
                             
                Query getUser = session.createQuery("Select j from DB_jason_json as j");

		@SuppressWarnings("unchecked")
                        //Java Collections LIST example
		List<DB_jason_json> user_list = getUser.list();

		transaction.commit();

		return user_list;
	} 
     
     static List<DB_jason_user> queryUsersInDB() {
		Session session = DBControl.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
                             
                Query getUser = session.createQuery("Select u from DB_jason_user as u");

		@SuppressWarnings("unchecked")
                        //Java Collections LIST example
		List<DB_jason_user> user_list = getUser.list();

		transaction.commit();

		return user_list;
	} 
     
     
}


