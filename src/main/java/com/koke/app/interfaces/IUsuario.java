package com.koke.app.interfaces;

import java.util.List;

import com.koke.app.model.Usuario;

public interface IUsuario {

	// Hace un Select * from a la tabla
	public List<Usuario> findAll();

	// Inserta datos en la tabla
	public String save(Usuario usuario);

	// Hace un Select condicionado
	public Usuario findById(int id);

	// Hace un update a la tabla
	public String mod(Usuario usuario);

	// Elimina un registro
	public String del(Usuario usuario);
}
