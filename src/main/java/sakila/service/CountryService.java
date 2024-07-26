package sakila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import sakila.model.Country;
import sakila.repository.CountryRepository;

@Service
@Slf4j
public class CountryService {
	@Autowired
	private CountryRepository countryRepo;

	public List<Country> getAllCountries(){
		return countryRepo.findAll();
	}
	
	public Country findByCountry(String cName) {
		return countryRepo.findByCountry(cName);
	}
	
	public Country saveCountry(Country c) {
		log.info("Country with details " + c.toString() + "is saved");
		countryRepo.save(c);
		return c;
	}
	
	
}
