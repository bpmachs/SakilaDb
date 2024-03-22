package sakila.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sakila.model.FilmActor;

@Repository
public interface FilmActorRepo extends JpaRepository<FilmActor, FilmActor>{

}
