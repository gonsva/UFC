package UFC.UFC_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import UFC.UFC_app.model.Stats;
import UFC.UFC_app.repository.StatsRepository;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("api/v1")
public class StatsController {
	
	@Autowired
	private StatsRepository statsRepository;
	
	@CrossOrigin("http://localhost:3306")
	@RequestMapping(value = "stats", method = RequestMethod.GET)
	public List<Stats> list(){return statsRepository.findAll();}
	
	
	}

