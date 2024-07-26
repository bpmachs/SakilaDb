package sakila.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "film_category")
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class FilmCategory {
	
	@Id
	private Long filmId;
	
	private Short categoryId;
	
	private LocalDateTime timestamp;
	
	
}
