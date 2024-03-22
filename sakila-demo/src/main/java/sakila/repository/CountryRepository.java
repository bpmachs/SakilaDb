package sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sakila.model.Country;

public interface CountryRepository extends JpaRepository<Country,Short>{
	
	@Query(value ="Select * from Country as C where Country.countryName = :cName", nativeQuery = true)
	Country findByCountry(String cName);
}
