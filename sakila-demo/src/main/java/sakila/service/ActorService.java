package sakila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sakila.exception.ActorException;
import sakila.model.Actor;
import sakila.repository.ActorRepository;

@Service
public class ActorService {
	
	@Autowired
	private ActorRepository actorRepo;
	
	
	public List<Actor> getActors(){
		return actorRepo.findAll();
	}
	
	public Actor saveActor(Actor actor) throws ActorException{
		
		if(!(actor.getActorId()==null)) {
			actorRepo.save(actor);
		} else {
			throw new ActorException("Enter a valid Actor Id");
		}
		return actor;
	}
}