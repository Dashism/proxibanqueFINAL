package fr.formation.proxibanqueFINAL.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.proxibanqueFINAL.metier.Client;

/**
 * Interface dont les méthodes du CRUD sont implémentés par Spring.
 * @author Adminl
 * L'annotation @Repository défini la classe qui remplit le rôle de DAO.
 *
 */
@Repository
public interface ClientDao extends JpaRepository<Client, Integer>{

}
