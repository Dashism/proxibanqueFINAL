package fr.formation.proxibanqueFINAL.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.proxibanqueFINAL.metier.Survey;

@Repository
public interface SurveyDao extends JpaRepository<Survey, Integer>{

}
