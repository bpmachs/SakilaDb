package sakila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sakila.model.FilmActor;
import sakila.repo.FilmActorRepo;

@Service
public class FilmActorService {
	
	@Autowired
	private FilmActorRepo filmActorRepo;
	
	
	
	public List<FilmActor> getAllFilmActors(){
		
		return filmActorRepo.findAll();
	}
}
