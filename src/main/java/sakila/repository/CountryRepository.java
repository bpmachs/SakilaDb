package sakila.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sakila.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Short>{
	
	//@Query(value ="Select * from Country as C where Country.countryName = :cName", nativeQuery = true)
	Country findByCountry(String cName);
	
	@Query(value = "select c.country_id as 'Country Id',\r\n"
			+ "c.country as 'Country'\r\n"
			+ "from Country as c\r\n"
			+ "where c.country in (\"Afghanistan\",\"Bangladesh\",\"China\");", nativeQuery = true)
	public List<Object> getCities();	
}
