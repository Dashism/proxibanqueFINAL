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
	
	@OneToMany(mappedBy="survey")
	private List<Opinion> opinions;
	
	
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
	 * @return the beginDate
	 */
	public LocalDate getBeginDate() {
		return beginDate;
	}

	/**
	 * @param beginDate the beginDate to set
	 */
	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * @return the supposedFinishDate
	 */
	public LocalDate getSupposedFinishDate() {
		return supposedFinishDate;
	}

	/**
	 * @param supposedFinishDate the supposedFinishDate to set
	 */
	public void setSupposedFinishDate(LocalDate supposedFinishDate) {
		this.supposedFinishDate = supposedFinishDate;
	}

	/**
	 * @return the endDate
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the opinions
	 */
	public List<Opinion> getOpinions() {
		return opinions;
	}

	/**
	 * @param opinions the opinions to set
	 */
	public void setOpinions(List<Opinion> opinions) {
		this.opinions = opinions;
	}


	

	
}
