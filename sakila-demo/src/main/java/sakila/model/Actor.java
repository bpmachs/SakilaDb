package sakila.model;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="actor")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short actorId;
	
	private String firstName;
	
	private String lastName;
	
	private LocalDateTime lastUpdate;
	
	
	
	public Actor() {
		super();
	}



	public Actor(Short actorId, String firstName, String lastName, LocalDateTime lastUpdate) {
		super();
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
	}



	public Short getActorId() {
		return actorId;
	}



	public void setActorId(Short actorId) {
		this.actorId = actorId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}



	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}



	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
				+ lastUpdate + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(actorId, firstName, lastName, lastUpdate);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		return Objects.equals(actorId, other.actorId) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(lastUpdate, other.lastUpdate);
	}
	
	
	
}
