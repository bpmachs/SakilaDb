package sakila.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="inventory")
public class Inventory {
	
	@Id
	private Long inventoryId;
	
	private Long filmId;
	
	private Short storeId;
	
	private LocalDateTime timestamp;
	
	
}
