package sakila.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="film")
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long filmId;
	
	private String description;
	
	private Long languageId;
	
	private LocalDateTime lastUpdate;
	
	private LocalDate year;
	
	private String title;
	
	private Integer originalLanguageId;
	
	//private Integer languageId;
	
	private BigDecimal rentalRate;
	
	@Enumerated(EnumType.STRING)
	private Rating rating;
	
	private Integer length;
	
	private BigDecimal replacementCost;
	
	private Short rentalDuration;

	
	
	public Film() {
		super();
	}
	
	public Film(Long filmId, String description, Long languageId, LocalDateTime lastUpdate, LocalDate year,
			String title, Integer originalLanguageId, BigDecimal rentalRate, Integer length, BigDecimal replacementCost,
			Short rentalDuration) {
		super();
		this.filmId = filmId;
		this.description = description;
		this.languageId = languageId;
		this.lastUpdate = lastUpdate;
		this.year = year;
		this.title = title;
		this.originalLanguageId = originalLanguageId;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rentalDuration = rentalDuration;
	}



	public Long getFilmId() {
		return filmId;
	}



	public void setFilmId(Long filmId) {
		this.filmId = filmId;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Long getLanguageId() {
		return languageId;
	}



	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}



	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}



	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}



	public LocalDate getYear() {
		return year;
	}



	public void setYear(LocalDate year) {
		this.year = year;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Integer getOriginalLanguageId() {
		return originalLanguageId;
	}



	public void setOriginalLanguageId(Integer originalLanguageId) {
		this.originalLanguageId = originalLanguageId;
	}



	public BigDecimal getRentalRate() {
		return rentalRate;
	}



	public void setRentalRate(BigDecimal rentalRate) {
		this.rentalRate = rentalRate;
	}



	public Integer getLength() {
		return length;
	}



	public void setLength(Integer length) {
		this.length = length;
	}



	public BigDecimal getReplacementCost() {
		return replacementCost;
	}



	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}



	public Short getRentalDuration() {
		return rentalDuration;
	}



	public void setRentalDuration(Short rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	
	 
	
}