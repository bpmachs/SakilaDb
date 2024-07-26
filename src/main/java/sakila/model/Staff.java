package sakila.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "staff")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
	
	@Id
	private Short staffId;
	
	private String firstName;
	
	private String lastName;
	
	private Long addressId;
	
	
	private byte[] picture;
	
	private String email;
	
	private Short storeId;
	
	private Short active;
	
	private String username;
	
	private String password;
	
	private LocalDateTime timestamp;
	
	
}
