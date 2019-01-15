package fr.formation.proxibanqueFINAL.metier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Définition commune pour les services utilisés par les services web REST.
 * 
 * @author jmasson
 *
 * @param <ENTITY> l'entité utilisée par le DAO.
 */
public abstract class RestService<ENTITY> {

	/**
	 * @return JpaRepository<ENTITY, Integer> le DAO a utiliser pour effectuer
	 *         l'accès BDD.
	 */
	protected abstract JpaRepository<ENTITY, Integer> getDao();
	
	/**
	 * Créer un objet entité à persister dans la base de données.
	 * @param entity
	 * @return
	 */
	public ENTITY create(final ENTITY entity) {
		return this.getDao().save(entity);
	}
	
	/**
	 * Accéder à un objet entité pour l'utiliser dans les différents services.
	 * @param id
	 * @return
	 */
	public ENTITY read(final Integer id) {
		return this.getDao().getOne(id);
	}
	
	/**
	 * Accéder à tous les objets entité d'une table pour les utiliser dans les différents services.
	 * @return
	 */
	public List<ENTITY> readAll() {
		return this.getDao().findAll();
	}
	
	/**
	 * Mettre à jour un objet entité dans la base de données.
	 * @param entity
	 * @return
	 */
	public ENTITY update(final ENTITY entity) {
		return this.getDao().save(entity);
	}
	
	/**
	 * Supprimer un objet entité de la base de données.
	 * @param id
	 */
	public void delete(final Integer id) {
		this.getDao().deleteById(id);
	}
}
