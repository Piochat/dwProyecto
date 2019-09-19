package com.koke.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koke.app.interfaces.ICliente;
import com.koke.app.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class RestCliente {

	/*
	 * Resful para la tabla clientes
	 */
	@Autowired
	private ICliente cliente;
	
	@GetMapping
	public List<Cliente> getClientes() {
		return cliente.findAll();
	}
	
	@PostMapping
	public String saveClientes(@RequestBody Cliente cl) {
		return cliente.save(cl);
	}
	
	@GetMapping(value = "/{id}")
	public Cliente getCliente(@PathVariable("id") Integer id) {
		return cliente.findById(id);
	}
	
	@PutMapping
	public String updateClientes(@RequestBody Cliente cl) {
		return cliente.mod(cl);
	}
	
	@DeleteMapping
	public String delClientes(@RequestBody Cliente cl) {
		return cliente.del(cl);
	}
}
