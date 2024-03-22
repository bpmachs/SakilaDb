package sakila.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FilmActorId  {
   
   @Column(name = "actor_id")
   private Short actorId;
   
   @Column(name = "film_id")
   private Short filmId;

   // Constructors, getters, and setters
   public FilmActorId() {
   }

   public FilmActorId(Short actorId, Short filmId) {
       this.actorId = actorId;
       this.filmId = filmId;
   }

	public FilmActorId(Short actorId2, Long filmId2) {
		// TODO Auto-generated constructor stub
	}

   // Override equals() and hashCode() methods
   // Implement Serializable interface
}