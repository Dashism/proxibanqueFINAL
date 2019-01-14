package fr.formation.proxibanqueFINAL.presentation.rest;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.proxibanqueFINAL.metier.Client;
import fr.formation.proxibanqueFINAL.metier.ClientService;

@RestController
@RequestMapping("/Client")
@Transactional(readOnly=true)
//@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class ClientWebService {
	
	@Autowired
	private ClientService service;
	
//	@GetMapping
//	public List<Client> list() {
//		return this.service.readAll();
//	}
//	
//	@PostMapping
//	public Client create(@RequestBody Client client) {
//		return this.service.create(client);
//	}
//	
//	@GetMapping("/{id}")
//	public Client read(@PathVariable Integer id) {
//		Client client = this.service.read(id);
//		Hibernate.initialize(client);
//		return client;
//	}
//	
//	@DeleteMapping("/{id}")
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void delete(@PathVariable Integer id) {
//		this.service.delete(id);
//	}
//	
//	@PutMapping("/{id}")
//	public Client update(@PathVariable Integer id,
//			@RequestBody Client client) {
//		return this.service.update(client);
//	}
	
	@GetMapping("/{id}")
	public Client getSerialNumber(@PathVariable String serialNumber) {
		return this.service.getSerialNumber(serialNumber);
		
	}
}
