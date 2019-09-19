package com.koke.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.koke.app.interfaces.IUsuario;
import com.koke.app.model.Usuario;

@Repository
public class UsuarioDAO implements IUsuario {

	@PersistenceContext
	private EntityManager em;

	/*
	 * Clase que controla las Querys Las convierte en funciones para El REST
	 */
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Usuario").getResultList();
	}

	@Transactional
	@Override
	public String save(Usuario usuario) {
		// TODO Auto-generated method stub
		try {
			em.persist(usuario);
			return "OK";
		} catch (Exception e) {
			System.err.println("Error Save" + e.getMessage() + " " + e.toString());
			return "Error";
		}
	} // end save

	@Transactional(readOnly = true)
	@Override
	public Usuario findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Usuario.class, id);
	}

	@Transactional
	@Override
	public String mod(Usuario usuario) {
		// TODO Auto-generated method stub
		try {
			em.merge(usuario);
			return "OK";
		} catch (Exception e) {
			System.err.println("Error mod" + e.getMessage() + " " + e.toString());
			return "Error";
		}
	} // end mod

	@Transactional
	@Override
	public String del(Usuario usuario) {
		// TODO Auto-generated method stub
		try {
			em.remove(em.find(Usuario.class, usuario.getId()));
			return "OK";
		} catch (Exception e) {
			System.err.println("Error del " + e.getMessage() + " " +  e.toString());
			return "Error";
		}
	} // end del

}
