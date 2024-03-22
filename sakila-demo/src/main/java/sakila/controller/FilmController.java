package sakila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sakila.model.Film;
import sakila.service.FilmService;

@RestController
@RequestMapping("api/v1")
public class FilmController {
	
	@Autowired
	private FilmService filmService;

//	public FilmController(FilmService filmService) {
//		super();
//		this.filmService = filmService;
//	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Film>> getFilms(){
		//List<Film> films = filmService.getAllFilms();
		return new ResponseEntity<List<Film>>(filmService.getAllFilms(),HttpStatus.OK);
	}
	
	@GetMapping("/less")
	public ResponseEntity<List<Film>> lowRentals(){
		return new ResponseEntity<List<Film>>(filmService.lessThanFourFilms(),HttpStatus.OK);
	}
	
	@GetMapping("/joins")
	public ResponseEntity<List<Object>> joinOps(){
		return new ResponseEntity<List<Object>>(filmService.joinOperations(),HttpStatus.OK);
	}
	
	@GetMapping("/genre")
	public ResponseEntity<List<Object>> getDeletedScens(){
		return new ResponseEntity<List<Object>>(filmService.deletedScenes(),HttpStatus.OK);
	} 
	
	@GetMapping("/groups")
	public ResponseEntity<List<Object>> groupByGenre(){
		return new ResponseEntity<List<Object>>(filmService.groupFilmsByGenre(),HttpStatus.OK);
	}
	@PostMapping("/save")
	public ResponseEntity<Film> saveFilmDoc(@RequestBody Film film){
		return new ResponseEntity<Film>(filmService.saveFilm(film),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Film> deleteFilm(@PathVariable("id") Long id){
		return new ResponseEntity<Film>(filmService.deleteFilm(id),HttpStatus.OK);
	}
}
