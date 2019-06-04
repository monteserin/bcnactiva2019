package jpa.com;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

private int id;
private String direccion;

	public Address(String direccion) {
	super();
	this.direccion = direccion;
}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
