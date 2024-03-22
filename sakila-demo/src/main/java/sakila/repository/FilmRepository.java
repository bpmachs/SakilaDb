package sakila.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sakila.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long>{
	
	@Query(value="select *from film where rental_rate < 4.00 and rental_duration < 4",nativeQuery = true)
	public List<Film> lessThanFourFilms();
	
	@Query(value = "select f.title, f.special_features ,fa.last_update from film f join film_actor fa on f.film_id = fa.film_id  ",nativeQuery=true)
	public List<Object> joinOperations();
	
	@Query(value="select distinct(f.title), f.special_features "
			+ "from film f join film_actor fa on f.film_id = fa.film_id "
			+ "where f.special_features LIKE 'Deleted Scenes'",nativeQuery=true)
	public List<Object> getDeletedScenes();
	
	@Query(value = "select f.special_features as features , count(f.title) , (select count(*) from film ) as count from film f group by f.special_features; ", nativeQuery = true)
	public List<Object> getGroupsByGenre();
	
	
}
