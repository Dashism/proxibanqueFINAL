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
}
