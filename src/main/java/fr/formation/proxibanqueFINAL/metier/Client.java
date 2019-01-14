package fr.formation.proxibanqueFINAL.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Définition d'un POJO (Plain Old Java Object), une classe qui respecte les
 * contraintes suivantes :
 * <ul>
 * <li>Des attributs (fields) uniquement <b>privés</b></li>
 * <li>Un constructeur par défaut (sans arguments)</li>
 * <li>Des accesseurs pour chaque attribut</li>
 * <li style="color:red;">Surtout pas de méthodes de traitement !</li>
 * </ul>
 */
@Entity
@Table(name="client")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private String serialNumber;
	
	@Column
	private String lastName;
	
	@Column
	private String firstame;
	
	@Column
	private String phone;

	@Column
	private String email;

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
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstame
	 */
	public String getFirstame() {
		return firstame;
	}

	/**
	 * @param firstame the firstame to set
	 */
	public void setFirstame(String firstame) {
		this.firstame = firstame;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
