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

import com.koke.app.interfaces.IInteres;
import com.koke.app.model.Interes;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/intereses")
public class RestInteres {

	@Autowired
	private IInteres interes;
	
	@GetMapping
	public List<Interes> getIntereses() {
		return interes.findAll();
	}
	
	@PostMapping
	public String saveInteres(@RequestBody Interes cl) {
		return interes.save(cl);
	}
	
	@GetMapping(value = "/{id}")
	public Interes getInteres(@PathVariable("id") Integer id) {
		return interes.findById(id);
	}
	
	@PutMapping
	public String updateInteres(@RequestBody Interes cl) {
		return interes.mod(cl);
	}
	
	@DeleteMapping
	public String delInteres(@RequestBody Interes cl) {
		return interes.del(cl);
	}
}
