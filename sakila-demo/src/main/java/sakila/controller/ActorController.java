package sakila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sakila.exception.ActorException;
import sakila.model.Actor;
import sakila.service.ActorService;

@RestController
@RequestMapping("api/v2")
public class ActorController {
	
	@Autowired
	private ActorService actorService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Actor>> getAllActors(){
		return new ResponseEntity<List<Actor>>(actorService.getActors(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Actor> saveActor(@RequestBody Actor actor) throws ActorException{
		return new ResponseEntity<Actor>(actorService.saveActor(actor),HttpStatus.OK);
	}
}
