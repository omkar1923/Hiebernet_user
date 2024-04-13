package hiebernet_user.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="user_info")
@Entity
public class User {
	
	@Id
	@Column(name="user_id")
	private int id;
	
	private String name;
	@Column(unique=true)
	private Long phone;
	@Column(unique=true)
	private String email;
	private String password;
	private String fbpassword;
	private String instpasswword;
	private String snapchatpassword;
	private String Xpassword;

}
