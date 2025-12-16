package Entity;

import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Doctor {
	@Id
	private int did;
	private String name;
	private String email;
	private String degree;
	
	@ManyToMany(cascade = CascadeType.ALL) // Insert Patients in the table automatically. Don't need to call persist() again and again for patients.
	private List<Patient> patients;		  // But but for doctor you have to call it again and again Or you can use List and add doctor using ForEach Loop
	
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}

	
}
