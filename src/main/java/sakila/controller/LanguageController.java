package sakila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sakila.model.Language;
import sakila.service.LanguageService;

@RestController
@RequestMapping("/language")
public class LanguageController {
	
	@Autowired
	private LanguageService langService;
	
	@GetMapping("/all")
	public List<Language> getLangs() {
		return langService.findAllLangs();
	}
	
}
