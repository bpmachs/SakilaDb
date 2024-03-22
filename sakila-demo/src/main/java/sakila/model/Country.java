package sakila.model;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short countryId;
	
	private String country;
	
	private LocalDateTime lastUpdate;
	
	
	
	public Country() {
		super();
	}



	public Country(short countryId, String country, LocalDateTime timestamp) {
		super();
		this.countryId = countryId;
		this.country = country;
		this.lastUpdate = timestamp;
	}



	public short getCountryId() {
		return countryId;
	}



	public void setCountryId(short countryId) {
		this.countryId = countryId;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public LocalDateTime getTimestamp() {
		return lastUpdate;
	}



	public void setTimestamp(LocalDateTime timestamp) {
		this.lastUpdate = timestamp;
	}



	@Override
	public int hashCode() {
		return Objects.hash(country, countryId, lastUpdate);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(country, other.country) && countryId == other.countryId
				&& Objects.equals(lastUpdate, other.lastUpdate);
	}



	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", country=" + country + ", timestamp=" + lastUpdate + "]";
	}
	
	
	
}
