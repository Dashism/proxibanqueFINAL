package fr.formation.proxibanqueFINAL.presentation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.proxibanqueFINAL.ProxibanqueFinalConstants;
import fr.formation.proxibanqueFINAL.metier.Client;
import fr.formation.proxibanqueFINAL.metier.ClientService;
import fr.formation.proxibanqueFINAL.metier.Opinion;
import fr.formation.proxibanqueFINAL.metier.OpinionService;
import fr.formation.proxibanqueFINAL.metier.Survey;
import fr.formation.proxibanqueFINAL.metier.SurveyService;

/**
 * Controleur des vues responsable de distribuer les bons objets vues/model pour
 * aller vers une page JSP avec les informations dans le model.
 * 
 * L'annotation @Controller défini la classe en tant que bean Spring singleton.
 * L'annotation @RequestMapping défini la classe comme capable de répondre sur
 * les requêtes HTTP commençant par "/".
 */
@Controller
@RequestMapping("/")
// Déclaration des attributs faisant partie de la session utilisateur.
//@SessionAttributes({ "author" })
// Déclaration d'une portée pour ce controller permettant d'être unique par session utilisateur.
//@Scope("session")
@Transactional(readOnly = true)
public class ViewController {

	/**
	 * Déclaration du Logger pour cette classe.
	 */
	private static final Logger LOGGER = Logger.getLogger(ViewController.class);

	/**
	 * Injection d'une dépendance au service des articles.
	 */
	@Autowired
	private ClientService clientService;

	@Autowired
	private OpinionService opinionService;

	@Autowired
	private SurveyService surveyService;

	/**
	 * Répond sur "http://localhost:8080/proxibanqueFINAL/" et
	 * "http://localhost:8080/proxibanqueFINAL/index.html".
	 * 
	 * @return ModelAndView la vue index.
	 */
	@RequestMapping({ "", "index" })
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		Survey survey = new Survey();
		survey = this.surveyService.getCurrentSurvey();
		Hibernate.initialize(survey);
		mav.addObject("survey", survey);
		return mav;
	}

	/**
	 * Répond sur "http://localhost:8080/proxibanqueFINAL/" et
	 * "http://localhost:8080/proxibanqueFINAL/index.html".
	 * 
	 * @return ModelAndView la vue index.
	 */
	@RequestMapping("createsurvey")
	public ModelAndView createsurvey() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("createsurvey");
		mav.addObject("survey", new Survey());
		return mav;
	}

	@RequestMapping(path = "createsurvey", method = RequestMethod.POST)
	public String validateForm(String beginDate, String supposedFinishDate) {
		final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		try {
			LocalDate dt1 = LocalDate.parse(beginDate, dtf);
			LocalDate dt2 = LocalDate.parse(supposedFinishDate, dtf);
			Survey survey = new Survey();
			survey.setBeginDate(dt1);
			survey.setSupposedFinishDate(dt2);
			this.surveyService.create(survey);
		} catch (java.time.format.DateTimeParseException e) {
			return ProxibanqueFinalConstants.REDIRECT_TO_CREATE;
		}
		return ProxibanqueFinalConstants.REDIRECT_TO_INDEX;
	}

	@RequestMapping("listsurvey")
	public ModelAndView listsurvey(Integer id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listsurvey");
		List<Integer> positiv = new ArrayList<>();
		List<Integer> negativ = new ArrayList<>();
		for (Survey survey : this.surveyService.readAll()) {
			positiv.add(this.surveyService.getPositivOpinionStats(survey));
			negativ.add(this.surveyService.getNegativOpinionStats(survey));
		}
		mav.addObject("pouceBleu", positiv);
		mav.addObject("pouceRouge", negativ);
		mav.addObject("surveys", this.surveyService.readAll());
		return mav;
	}

	@RequestMapping("stopsurvey")
	public String stopsurvey(@RequestParam Integer id) {
		Survey survey = new Survey();
		survey = this.surveyService.read(id);
		survey.setEndDate(LocalDate.now());
		return ProxibanqueFinalConstants.REDIRECT_TO_INDEX;
	}

	@RequestMapping("details")
	public ModelAndView details(@RequestParam Integer id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("details");
		Survey survey =  this.surveyService.read(id);
		List<Opinion> opinions = survey.getOpinions();
		List<Opinion> negativOpinions = new ArrayList<>();
		List<Opinion> positivOpinions = new ArrayList<>();
		List<Client> positivClients = new ArrayList<>();
		for(Opinion opinion : opinions) {
			if(opinion.getCommentary() != null) {
				negativOpinions.add(opinion);
			} else {
				positivOpinions.add(opinion);
			}
		}
		for(Opinion opinion : positivOpinions) {
			positivClients.add(opinion.getClient());
		}
		mav.addObject("negativOpinions", negativOpinions);
		mav.addObject("positivClients", positivClients);
		return mav;
	}
	
}
