/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hib;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author BULLOJP
 */

public class ControllerInsertJSON {
   static void AddUser() {
        // moved session factory to Model
   // Session session = DBConnect.getSessionFactory().getCurrentSession();
  //  Transaction transaction = session.beginTransaction();
        
       Jason_Json person = new Jason_Json();
       person.setJson_id(0003);
       person.setLax_json("Jason");
       person.setStrict_json("Jason@gmail.com");
       person.setUnique_json("8005551212");
       //to save to database
       Model.addPerson(person);
      // session.flush();
       //session.close(); 
      // System.out.println(person);
      System.out.println("USER ADDED!!!!!");
  //
                          }
 /* 
static void listOwners() {
		List<Jason_Json> userList = Model.getUserFromDB();
		
		System.out.println();
		System.out.println("Owners in Database");
		System.out.printf("%-5s%-16s%-16s%-20s\n","ID","First Name","Last Name","Gender");
		System.out.printf("%-5s%-16s%-16s%-20s\n","--","----------","---------","------");
		
		Iterator<Jason_Json> ownerIterator = userList.iterator();
		
		while(ownerIterator.hasNext()) {
			
			Jason_Json element = ownerIterator.next();
			System.out.printf("%-5s%-16s%-16s%-20s\n",element.getId(),element.getJsonId(),
					element.getLax_json(),element.getStrict_json());
			
}


}*/
   
}
