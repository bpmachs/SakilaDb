package sakila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sakila.model.Language;
import sakila.repository.LanguageRepo;

@Service
public class LanguageService {
	
	
	@Autowired
	private LanguageRepo langRepo;
	
	public List<Language> findAllLangs(){
	
	return langRepo.findAll();
}
}