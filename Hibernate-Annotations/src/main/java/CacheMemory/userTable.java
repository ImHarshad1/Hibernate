package CacheMemory;

import java.time.LocalDateTime;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.ValueGenerationType;

@Entity
@Table(name="User_Table")
@Cacheable
public class userTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	
	@Column(name= "Username")
	private String name;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(updatable = false)
	private Long phone;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime createdDatet;
	
	@UpdateTimestamp
	private LocalDateTime updateDatet;
	
	

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", createdDatet="
				+ createdDatet + ", updateDatet=" + updateDatet + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public LocalDateTime getCreatedDatet() {
		return createdDatet;
	}

	public void setCreatedDatet(LocalDateTime createdDatet) {
		this.createdDatet = createdDatet;
	}

	public LocalDateTime getUpdateDatet() {
		return updateDatet;
	}

	public void setUpdateDatet(LocalDateTime updateDatet) {
		this.updateDatet = updateDatet;
	} 
	
	
}
