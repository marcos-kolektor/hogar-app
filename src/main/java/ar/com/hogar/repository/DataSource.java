package ar.com.hogar.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DataSource {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
}
