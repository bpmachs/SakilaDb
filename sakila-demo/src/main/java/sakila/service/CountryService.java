package sakila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sakila.model.Country;
import sakila.repository.CountryRepository;

@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepo;

	public List<Country> getAllCountries(){
		return countryRepo.findAll();
	}
	
	public Country findByCountry(String cName) {
		return countryRepo.findByCountry(cName);
	}
	
	
}
