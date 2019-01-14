package fr.formation.proxibanqueFINAL.metier;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="survey")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Survey {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private LocalDate beginDate;
	
	@Column
	private LocalDate supposedFinishDate;
	
	@Column
	private LocalDate endDate;
	
	@OneToMany
	@JoinColumn(name="id_opinion", referencedColumnName="id")
	private List<Opinion> opinions;
	
}
