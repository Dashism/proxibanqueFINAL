package fr.formation.proxibanqueFINAL.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.proxibanqueFINAL.metier.Opinion;

@Repository
public interface OpinionDao extends JpaRepository<Opinion, Integer>{

}
