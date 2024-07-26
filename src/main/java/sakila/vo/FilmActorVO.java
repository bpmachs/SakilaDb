package sakila.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sakila.model.Actor;
import sakila.model.Film;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmActorVO {
	
	private Film film;
	
	private Actor actor;
}
