package fr.formation.proxibanqueFINAL.presentation.rest;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.proxibanqueFINAL.metier.Opinion;
import fr.formation.proxibanqueFINAL.metier.OpinionService;

@RestController
@RequestMapping("/opinion")
@Transactional(readOnly=true)
//@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class OpinionWebService {

	@Autowired
	private OpinionService service;
	
//	@GetMapping
//	public List<Opinion> list() {
//		return this.service.readAll();
//	}
//	
	@PostMapping
	public Opinion create(@RequestBody Opinion opinion) {
		return this.service.create(opinion);
	}
	
//	@GetMapping("/{id}")
//	public Opinion read(@PathVariable Integer id) {
//		Opinion opinion = this.service.read(id);
//		Hibernate.initialize(opinion);
//		return opinion;
//	}
	
//	@DeleteMapping("/{id}")
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void delete(@PathVariable Integer id) {
//		this.service.delete(id);
//	}
//	
//	@PutMapping("/{id}")
//	public Opinion update(@PathVariable Integer id,
//			@RequestBody Opinion opinion) {
//		return this.service.update(opinion);
//	}
}
