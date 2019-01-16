package fr.formation.proxibanqueFINAL.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxibanqueFINAL.persistance.OpinionDao;

/**
 * Appel de la classe abstraite RestService.
 * @author Adminl
 *
 */
@Service
public class OpinionService extends RestService<Opinion> {

	@Autowired
	private OpinionDao dao;

	/**
	 * Récupère la dao pour accéder à la BDD.
	 */
	@Override
	protected JpaRepository<Opinion, Integer> getDao() {
		return this.dao;
	}
	
	
}

