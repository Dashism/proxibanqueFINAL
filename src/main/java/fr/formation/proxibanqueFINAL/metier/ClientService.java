package fr.formation.proxibanqueFINAL.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxibanqueFINAL.persistance.ClientDao;

/**
 * Appel de la classe abstraite RestService.
 * @author Adminl
 *
 */
@Service
public class ClientService extends RestService<Client> {

	@Autowired
	private ClientDao dao;

	/**
	 * Récupère la dao pour accéder à la BDD.
	 */
	@Override
	protected JpaRepository<Client, Integer> getDao() {
		return this.dao;
	}
	
	/**
	 * Récupère l'attribut 'serial number' d'un client spécifique.
	 * @param serialNumber
	 * @return
	 */
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
