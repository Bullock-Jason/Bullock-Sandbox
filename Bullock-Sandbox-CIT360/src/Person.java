/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

/**
 *
 * @author BULLOJP
 */
public class Person implements Serializable {
 /** Database parameters are mapped through classes and variables. The database table has to be the same name as the CLASS (in this case, PERSON). The columns are mapped to variables.
  * 
  * These are mapped through a mapping file
  */
    private int id;
    private String name;
    private String phone;
    private String email;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Also needs an empty constructor
    public Person(){}
    

    
    
    
}
