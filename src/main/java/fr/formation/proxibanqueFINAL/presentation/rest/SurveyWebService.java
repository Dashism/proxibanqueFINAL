package fr.formation.proxibanqueFINAL.presentation.rest;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.proxibanqueFINAL.metier.Survey;
import fr.formation.proxibanqueFINAL.metier.SurveyService;

@RestController
@RequestMapping("/Survey")
@Transactional(readOnly = true)
//@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class SurveyWebService {

	@Autowired
	private SurveyService service;

//	@GetMapping
//	public List<Survey> list() {
//		return this.service.readAll();
//	}
//	
//	@PostMapping
//	public Survey create(@RequestBody Survey survey) {
//		return this.service.create(survey);
//	}
//	
//	@GetMapping("/{id}")
//	public Survey read(@PathVariable Integer id) {
//		Survey survey = this.service.read(id);
//		Hibernate.initialize(survey);
//		return survey;
//	}
//	
//	@DeleteMapping("/{id}")
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void delete(@PathVariable Integer id) {
//		this.service.delete(id);
//	}
//	
//	@PutMapping("/{id}")
//	public Survey update(@PathVariable Integer id,
//			@RequestBody Survey survey) {
//		return this.service.update(survey);
//	}

	@GetMapping("/{id}")
	public Survey getCurrentSurvey() {
		return this.service.getCurrentSurvey();

	}
	
//	@GetMapping("/{id}")
//	public Float getStats() {
//		return this.service.getOpinionStats();
//	}
//	

}
