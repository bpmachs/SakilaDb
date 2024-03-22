package sakila.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="language")
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short languageId;
	
	private LocalDateTime lastUpdate;
	
	private String name;
	
	
	
	public Language() {
		super();
	}
	
	


	@Override
	public String toString() {
		return "Language [languageId=" + languageId + ", lastUpdate=" + lastUpdate + ", name=" + name + "]";
	}




	public Short getLanguageId() {
		return languageId;
	}




	public void setLanguageId(Short languageId) {
		this.languageId = languageId;
	}




	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}




	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Language(Short languageId, LocalDateTime lastUpdate, String name) {
		super();
		this.languageId = languageId;
		this.lastUpdate = lastUpdate;
		this.name = name;
	}
	
	
}
