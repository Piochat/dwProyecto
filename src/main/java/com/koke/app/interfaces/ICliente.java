package com.koke.app.interfaces;

import java.util.List;

import com.koke.app.model.Cliente;

public interface ICliente {

	// Hace un Select * from a la tabla
	public List<Cliente> findAll();

	// Inserta datos en la tabla
	public String save(Cliente cliente);

	// Hace un Select condicionado
	public Cliente findById(int id);

	// Hace un update a la tabla
	public String mod(Cliente cliente);

	// Elimina un registro
	public String del(Cliente cliente);
}
