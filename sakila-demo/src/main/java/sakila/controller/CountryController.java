package sakila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sakila.model.Country;
import sakila.service.CountryService;

@RestController
@RequestMapping("api/v3")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Country>> getAllCountries(){
		return new ResponseEntity<List<Country>>(countryService.getAllCountries(),HttpStatus.OK);
	}
	
	@GetMapping("/{cName}")
	public ResponseEntity<Country> findCountryName(@PathVariable("cName")String cName){
		return new ResponseEntity<Country>(countryService.findByCountry(cName),HttpStatus.OK);
	}
	
	
}
