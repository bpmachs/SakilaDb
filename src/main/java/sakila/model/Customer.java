package sakila.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	private Long customerId;
	
	private Short storeId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private Short active;
	
	private LocalDate createDate;
	
	private LocalDateTime lastUpdate;
}
