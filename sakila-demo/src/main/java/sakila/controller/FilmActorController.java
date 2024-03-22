package sakila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sakila.model.Country;
import sakila.model.FilmActor;
import sakila.service.FilmActorService;

@RestController
@RequestMapping("api/v5")
public class FilmActorController {
	
	@Autowired
	private FilmActorService filmActorService;
	
	@GetMapping("/all")
	public ResponseEntity<List<FilmActor>> getAllCountries(){
		return new ResponseEntity<List<FilmActor>>(filmActorService.getAllFilmActors(),HttpStatus.OK);
	}
}

