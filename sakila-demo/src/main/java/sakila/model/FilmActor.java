package sakila.model;

import java.io.Serializable;
import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "film_actor")
public class FilmActor {
    
    @EmbeddedId
    private FilmActorId id;
    
    @ManyToOne
    @MapsId("actorId")
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id")
    private Film film;
    
    @Column(name = "last_update", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp lastUpdate;

    // Constructors, getters, and setters
    public FilmActor() {
    }

    public FilmActor(Actor actor, Film film) {
        this.actor = actor;
        this.film = film;
        this.id = new FilmActorId(actor.getActorId(), film.getFilmId());
    }

    public FilmActorId getId() {
        return id;
    }

    public void setId(FilmActorId id) {
        this.id = id;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

