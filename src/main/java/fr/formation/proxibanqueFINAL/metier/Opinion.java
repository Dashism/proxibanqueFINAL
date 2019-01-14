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
	private Boolean isThumbs;
	
	@OneToOne
	@JoinColumn(name="id_client", referencedColumnName="id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="id_survey", referencedColumnName="id")
	private Survey survey;
}
