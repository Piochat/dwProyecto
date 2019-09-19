package com.koke.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.koke.app.interfaces.ICredito;
import com.koke.app.model.Credito;

@Repository
public class CreditoDAO implements ICredito {

	@PersistenceContext
	private EntityManager em;
	
	/*
	 * Clase que controla las Querys 
	 * Las convierte en funciones para El REST
	 */
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Credito> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Credito").getResultList();
	}

	@Transactional
	@Override
	public String save(Credito cl) {
		// TODO Auto-generated method stub
		try {
			em.persist(cl);
			return "OK";
		} catch (Exception e) {
			System.err.println("Error Save" + e.getMessage() + " " +  e.toString());
			return "Error";
		}
	} // end save

	@Transactional(readOnly = true)
	@Override
	public Credito findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Credito.class, id);
	} // end findById

	@Transactional
	@Override
	public String mod(Credito cl) {
		// TODO Auto-generated method stub
		try {
			em.merge(cl);
			return "OK";
		} catch (Exception e) {
			System.err.println("Error mod" + e.getMessage() + " " +  e.toString());
			return "Error";
		}
	} // end mod

	@Override
	public String del(Credito cl) {
		// TODO Auto-generated method stub
		try {
			em.remove(em.find(Credito.class, cl.getId()));
			return "OK";
		} catch (Exception e) {
			System.err.println("Error del " + e.getMessage() + " " +  e.toString());
			return "Error";
		}
	} // end del
}
