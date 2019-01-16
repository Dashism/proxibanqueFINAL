package fr.formation.proxibanqueFINAL.presentation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.proxibanqueFINAL.metier.Survey;
import fr.formation.proxibanqueFINAL.metier.SurveyService;

/**
 * Permet le dialogue via Internet avec l'application Angular, pour un objet Sondage.
 * @author Adminl
 *
 */
@RestController
@RequestMapping("/survey")
@Transactional(readOnly = true)
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class SurveyWebService {

	@Autowired
	private SurveyService service;

	/**
	 * Appelle la méthode de SurveyService, afin de récupérer le sondage en cours, s'il y en a un.
	 * @return
	 */
	@GetMapping
	public Survey getCurrentSurvey() {
		return this.service.getCurrentSurvey();
	}
}
