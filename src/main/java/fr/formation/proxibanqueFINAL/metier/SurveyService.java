package fr.formation.proxibanqueFINAL.metier;

import java.time.LocalDate;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxibanqueFINAL.persistance.SurveyDao;

/**
 * Appel de la classe abstraite RestService.
 * @author Adminl
 *
 */
@Service
public class SurveyService extends RestService<Survey> {

	private static final Logger LOGGER = Logger.getLogger(SurveyService.class);

	@Autowired
	private SurveyDao dao;

	/**
	 * Récupère la dao pour accéder à la BDD.
	 */
	@Override
	protected JpaRepository<Survey, Integer> getDao() {
		return this.dao;
	}

	/**
	 * Récupère le sondage en cours, s'il en existe un.
	 * @return
	 */
	public Survey getCurrentSurvey() {
		Survey currentSurvey = null;
		List<Survey> surveys = this.dao.findAll();
		LOGGER.debug(this.dao.findAll());
		for (Survey survey : surveys) {
			if (survey.getEndDate() == null && survey.getBeginDate().isBefore(LocalDate.now())
					&& survey.getSupposedFinishDate().isAfter(LocalDate.now())) {
				currentSurvey = survey;
			}
		}
		Hibernate.initialize(currentSurvey);
		return currentSurvey;

	}

	/**
	 * Récupère le nombre d'avis positifs, liés à un sondage.
	 * @param survey
	 * @return
	 */
	public Integer getPositivOpinionStats(Survey survey) {
		List<Opinion> opinions = survey.getOpinions();
		Integer count = 0;
		for (Opinion opinion : opinions) {
			if (opinion.getIsThumbs().equals("1")) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Récupère le nombre d'avis négatifs, liés à un sondage.
	 * @param survey
	 * @return
	 */
	public Integer getNegativOpinionStats(Survey survey) {
		List<Opinion> opinions = survey.getOpinions();
		Integer count = 0;
		for (Opinion opinion : opinions) {
			if (opinion.getIsThumbs().equals("0")) {
				count++;
			}
		}
		return count;
	}
	
	

}
