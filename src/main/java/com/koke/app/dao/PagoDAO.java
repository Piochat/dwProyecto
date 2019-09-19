package com.koke.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.koke.app.interfaces.IPago;
import com.koke.app.model.Pago;

@Repository
public class PagoDAO implements IPago {

	@PersistenceContext
	private EntityManager em;

	/*
	 * Clase que controla las Querys Las convierte en funciones para El REST
	 */
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Pago> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Pago").getResultList();
	}

	@Transactional
	@Override
	public String save(Pago cl) {
		// TODO Auto-generated method stub
		try {
			em.persist(cl);
			return "OK";
		} catch (Exception e) {
			System.err.println("Error Save" + e.getMessage() + " " + e.toString());
			return "Error";
		}
	} // end save

	@Transactional(readOnly = true)
	@Override
	public Pago findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Pago.class, id);
	} // end findById

	@Transactional
	@Override
	public String mod(Pago cl) {
		// TODO Auto-generated method stub
		try {
			em.merge(cl);
			return "OK";
		} catch (Exception e) {
			System.err.println("Error mod" + e.getMessage() + " " + e.toString());
			return "Error";
		}
	} // end mod

	@Override
	public String del(Pago cl) {
		// TODO Auto-generated method stub
		try {
			em.remove(em.find(Pago.class, cl.getId()));
			return "OK";
		} catch (Exception e) {
			System.err.println("Error del " + e.getMessage() + " " + e.toString());
			return "Error";
		}
	} // end del
}
