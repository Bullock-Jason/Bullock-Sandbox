package Hib;
// Generated Oct 25, 2016 6:06:39 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 


@Entity
@Table(name = "jason_json")
public class Jason_Json {
//-----------------//
	// Column mappings //
	//-----------------//
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
    
        @Column(name="json_id")
        private Integer json_id;

	@Column(name="lax_json")
	private String lax_json;
	
	@Column(name="strict_json")
	private String strict_json;
	
	@Column(name="unique_json")
	private String unique_json;

	
	//--------------//
	// Constructors //
	//--------------//
	public Jason_Json () {
		
	}
        	public Jason_Json(String lax, String strict, String unique, Integer jid) {
		this.json_id = jid;
		this.lax_json = lax;
		this.strict_json = strict;
		this.unique_json = unique;
	
	}

    public Integer getJson_id() {
        return json_id;
    }

    public void setJson_id(Integer json_id) {
        this.json_id = json_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getJsonId() {
        return id;
    }

    public void setJsonId(Integer id) {
        this.id = id;
    }
    public String getLax_json() {
        return lax_json;
    }

    public void setLax_json(String lax_json) {
        this.lax_json = lax_json;
    }

    public String getStrict_json() {
        return strict_json;
    }

    public void setStrict_json(String strict_json) {
        this.strict_json = strict_json;
    }

    public String getUnique_json() {
        return unique_json;
    }

    public void setUnique_json(String unique_json) {
        this.unique_json = unique_json;
    }

}
