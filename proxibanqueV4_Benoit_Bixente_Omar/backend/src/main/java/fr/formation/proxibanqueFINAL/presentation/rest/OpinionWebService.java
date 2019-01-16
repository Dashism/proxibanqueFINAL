package fr.formation.proxibanqueFINAL.presentation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.proxibanqueFINAL.metier.Opinion;
import fr.formation.proxibanqueFINAL.metier.OpinionService;

/**
 * Permet le dialogue via Internet avec l'application Angular, pour un objet Opinion.
 * @author Adminl
 *
 */
@RestController
@RequestMapping("/opinion")
@Transactional(readOnly=true)
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class OpinionWebService {

	@Autowired
	private OpinionService service;
	
	/**
	 * Appel de la méthode create de OpinionService, lorsque qu'un utilisateur rentre un Commentaire/Opinion, 
	 * afin de le persister dans la BDD.
	 * @param opinion
	 * @return
	 */
	@PostMapping
	public Opinion create(@RequestBody Opinion opinion) {
		return this.service.create(opinion);
	}
	
}
