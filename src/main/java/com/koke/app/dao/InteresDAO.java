package com.koke.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.koke.app.interfaces.IInteres;
import com.koke.app.model.Interes;

@Repository
public class InteresDAO implements IInteres {

	@PersistenceContext
	private EntityManager em;

	/*
	 * Clase que controla las Querys Las convierte en funciones para El REST
	 */
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Interes> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Interes").getResultList();
	}

	@Transactional
	@Override
	public String save(Interes interes) {
		// TODO Auto-generated method stub
		try {
			em.persist(interes);
			return "OK";
		} catch (Exception e) {
			System.err.println("Error Save" + e.getMessage() + " " + e.toString());
			return "Error";
		}
	}

	@Transactional(readOnly = true)
	@Override
	public Interes findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Interes.class, id);
	}

	@Transactional
	@Override
	public String mod(Interes interes) {
		// TODO Auto-generated method stub
		try {
			em.merge(interes);
			return "OK";
		} catch (Exception e) {
			System.err.println("Error mod" + e.getMessage() + " " +  e.toString());
			return "Error";
		}
	}

	@Transactional
	@Override
	public String del(Interes interes) {
		// TODO Auto-generated method stub
		try {
			em.remove(em.find(Interes.class, interes.getId()));
			return "OK";
		} catch (Exception e) {
			System.err.println("Error del " + e.getMessage() + " " +  e.toString());
			return "Error";
		}
	}
}
