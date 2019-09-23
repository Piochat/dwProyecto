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

import com.koke.app.interfaces.ICredito;
import com.koke.app.model.Credito;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/creditos")
public class RestCredito {

	@Autowired
	private ICredito credito;
	
	@GetMapping
	public List<Credito> getCreditos() {
		return credito.findAll();
	}
	
	@PostMapping
	public String saveCredito(@RequestBody Credito cl) {
		return credito.save(cl);
	}
	
	@GetMapping(value = "/{id}")
	public Credito getCredito(@PathVariable("id") Integer id) {
		return credito.findById(id);
	}
	
	@PutMapping
	public String updateCredito(@RequestBody Credito cl) {
		return credito.mod(cl);
	}
	
	@DeleteMapping
	public String delCredito(@RequestBody Credito c) {
		return credito.del(c);
	}
}
