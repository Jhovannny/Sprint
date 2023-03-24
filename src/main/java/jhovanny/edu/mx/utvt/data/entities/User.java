package jhovanny.edu.mx.utvt.data.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")
public class User {
private static final long serialVersionUID = -1156945731802631833L;
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "username", nullable = false, unique = true)
	private String username;
	@Column(name = "pwd", nullable = false)
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User (String username, String password) {
		super();
		this.username = username;
		this.password = password;
}
}
