package sakila.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sakila.exception.FilmException;
import sakila.model.Film;
import sakila.repository.FilmRepository;

@Service
public class FilmService {
	
	@Autowired
	private FilmRepository filmRepo;
	
	
	public List<Film> getAllFilms()throws FilmException{
		return  filmRepo.findAll();
	}
	
	public Film saveFilm(Film film) {
		if((film !=null)) {
			filmRepo.save(film);
		} else {
			throw new FilmException("Film Id is not valid");
		}
		return film;
	}
	public List<Film> lessThanFourFilms(){
		return filmRepo.lessThanFourFilms();
	}
	
	public List<Object> joinOperations(){
		return filmRepo.joinOperations();
	}
	
	public List<Object> deletedScenes(){
		return filmRepo.getDeletedScenes();
	}
	
	public List<Object> groupFilmsByGenre(){
		return filmRepo.getGroupsByGenre();
	}
	
	public Film deleteFilm(Long id) {
		Optional<Film> f = filmRepo.findById(id);
		filmRepo.deleteById(id);
		return f.get();
		
	}
	
}
