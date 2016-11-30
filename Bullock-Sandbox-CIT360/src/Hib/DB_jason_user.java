/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hib;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 


/**
 *
 * @author BULLOJP
 */


@Entity
@Table(name = "DB_jason_user")
public class DB_jason_user {
//-----------------//
	// Column mappings //
	//-----------------//
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private Integer userID;
    
        @Column(name="name")
        private String name;

	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	        
	//--------------//
	// Constructors //
	//--------------//
	public DB_jason_user () {
		
	}
        	public DB_jason_user(Integer uid, String phone, String email, String name) {
		this.userID = uid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	
	}

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
        
        
}