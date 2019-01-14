package fr.formation.proxibanqueFINAL.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.proxibanqueFINAL.persistance.OpinionDao;

@Service
public class OpinionService extends RestService<Opinion> {

	@Autowired
	private OpinionDao dao;

	@Override
	protected JpaRepository<Opinion, Integer> getDao() {
		return this.dao;
	}
	

	}

