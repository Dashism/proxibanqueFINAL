package fr.formation.proxibanqueFINAL.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="opinion")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Opinion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private String commentary;
	
	@Column
	private String isThumbs;
	
	@OneToOne
	@JoinColumn(name="id_client", referencedColumnName="id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="id_survey", referencedColumnName="id")
	private Survey survey;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the commentary
	 */
	public String getCommentary() {
		return commentary;
	}

	/**
	 * @param commentary the commentary to set
	 */
	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	/**
	 * @return the isThumbs
	 */
	public String getIsThumbs() {
		return isThumbs;
	}

	/**
	 * @param isThumbs the isThumbs to set
	 */
	public void setIsThumbs(String isThumbs) {
		this.isThumbs = isThumbs;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the survey
	 */
	public Survey getSurvey() {
		return survey;
	}

	/**
	 * @param survey the survey to set
	 */
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	
	
}
