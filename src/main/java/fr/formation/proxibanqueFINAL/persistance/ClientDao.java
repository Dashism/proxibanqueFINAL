package fr.formation.proxibanqueFINAL.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.proxibanqueFINAL.metier.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Integer>{

}
