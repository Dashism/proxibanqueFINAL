package fr.formation.proxibanqueFINAL.metier;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxibanqueFINAL.persistance.SurveyDao;

@Service
public class SurveyService extends RestService<Survey> {

	@Autowired
	private SurveyDao dao;

	@Override
	protected JpaRepository<Survey, Integer> getDao() {
		return this.dao;
	}
	
	public Survey getCurrentSurvey() {
		Survey currentSurvey = null;
		List<Survey> surveys = this.dao.findAll();
		for (Survey survey : surveys) {
			if (survey.getBeginDate().isBefore(LocalDate.now()) && survey.getEndDate().isAfter(LocalDate.now())) {
				currentSurvey = survey;
			}
		}

		Hibernate.initialize(currentSurvey);
		return currentSurvey;

	}

}
