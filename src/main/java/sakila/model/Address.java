package sakila.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	
	@Id
	private Long addressId;
	
	private String address;
	
	private String adrress2;
	
	private String district;
	
	private String postalCode;
	
	private String phone;
	
	private byte[] location;
	
	private LocalDateTime timestamp;
	
	
}
