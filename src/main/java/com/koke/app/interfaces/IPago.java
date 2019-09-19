package com.koke.app.interfaces;

import java.util.List;

import com.koke.app.model.Pago;

public interface IPago {
	
	// Hace un Select * from a la tabla
	public List<Pago> findAll();
	
	// Inserta datos en la tabla
	public String save(Pago pago);
	
	// Hace un Select condicionado
	public Pago findById(int id);
	
	// Hace un update a la tabla
	public String mod(Pago pago);
	
	// Elimina un registro
	public String del(Pago pago);
}
