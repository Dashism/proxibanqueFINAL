package fr.formation.proxibanqueFINAL.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import fr.formation.proxibanqueFINAL.persistance.ClientDao;

@Service
public class ClientService extends RestService<Client> {

	@Autowired
	private ClientDao dao;

	@Override
	protected JpaRepository<Client, Integer> getDao() {
		return this.dao;
	}
	
	public Client getSerialNumber(String serialNumber) {
		Client currentClient = null;
		List<Client> clients = new ArrayList<>();
		clients = this.dao.findAll();
		for(Client client : clients) {
			if(
		client.getSerialNumber().equals(serialNumber)) {
				currentClient = client;
			}
			
		}
		return currentClient;
	}	
}
