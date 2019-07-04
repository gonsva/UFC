package UFC.UFC_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import UFC.UFC_app.model.Stats;
import UFC.UFC_app.repository.StatsRepository;

@RestController
public class HomeController {
	
	
	@Autowired
	private StatsRepository statsRepository;
	
	
	@RequestMapping("/") //this annotation is for specifying the url that will then trigger this method
	public String home() {
		return "Hello everyoneeeeee";
	}

	
	@RequestMapping("/show") //this annotation is for specifying the url that will then trigger this method
	public ResponseEntity<List<Stats>> displayrecords() {
		
	
		return ResponseEntity.ok(statsRepository.findAll());
	}
	
	@RequestMapping(value = "/dataentry", method = RequestMethod.POST)
	public String entry(Stats s) {
		statsRepository.saveAndFlush(s);
		return "saved";
	}
	
	@RequestMapping(value = "/datasearch/{id}", method = RequestMethod.GET)
	//Annotation for mapping web requests onto specific handler classes and/orhandler methods
	public ResponseEntity<Stats> entry(@PathVariable long id) {
		
		return ResponseEntity.ok(statsRepository.findOne(id));
	}
	
	
	
}
