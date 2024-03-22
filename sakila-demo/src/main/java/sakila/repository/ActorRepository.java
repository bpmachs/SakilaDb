package sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sakila.model.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Short>{

}
