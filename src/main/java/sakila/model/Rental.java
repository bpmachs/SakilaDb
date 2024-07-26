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
@Table(name = "rental")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rental {
	
	@Id
	private Long rentalId;
	
	private LocalDate rentalDate;
	
	private Long inventoryId;
	
	private Long customerId;
	
	private LocalDateTime returnDate;
	
	private Short staffId;
	
	private LocalDateTime lastUpdate;
}
