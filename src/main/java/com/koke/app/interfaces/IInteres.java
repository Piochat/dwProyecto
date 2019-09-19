package com.koke.app.interfaces;

import java.util.List;

import com.koke.app.model.Interes;

public interface IInteres {

	// Hace un Select * from a la tabla
	public List<Interes> findAll();
	
	// Inserta datos en la tabla
	public String save(Interes interes);
	
	// Hace un Select condicionado
	public Interes findById(int id);
	
	// Hace un update a la tabla
	public String mod(Interes interes);
	
	// Elimina un registro
	public String del(Interes interes);
}
