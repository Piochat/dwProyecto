package com.koke.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koke.app.interfaces.IUsuario;
import com.koke.app.model.Usuario;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/usuarios")
public class RestUsuario {

	@Autowired
	private IUsuario usuario;
	
	@GetMapping
	public List<Usuario> getUsuarios() {
		return usuario.findAll();
	}
	
	@PostMapping
	public String saveUsuario(@RequestBody Usuario cl) {
		return usuario.save(cl);
	}
	
	@GetMapping(value = "/{id}")
	public Usuario getUsuario(@PathVariable("id") Integer id) {
		return usuario.findById(id);
	}
	
	@PutMapping
	public String updateUsuario(@RequestBody Usuario cl) {
		return usuario.mod(cl);
	}
	
	@DeleteMapping
	public String delUsuario(@RequestBody Usuario cl) {
		return usuario.del(cl);
	}
}
