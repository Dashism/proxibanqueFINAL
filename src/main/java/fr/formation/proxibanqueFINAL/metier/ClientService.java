package fr.formation.proxibanqueFINAL.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxibanqueFINAL.persistance.ClientDao;

@Service
public class ClientService extends RestService<Client> {

	@Autowired
	private ClientDao dao;

	@Override
	protected JpaRepository<Client, Integer> getDao() {
		return this.dao;
	}

}
