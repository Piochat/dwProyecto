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

import com.koke.app.interfaces.IPago;
import com.koke.app.model.Pago;

@RestController
@RequestMapping("/pagos")
public class RestPago {

	@Autowired
	private IPago pago;
	
	@GetMapping
	public List<Pago> getPagos() {
		return pago.findAll();
	}
	
	@PostMapping
	public String savePago(@RequestBody Pago cl) {
		return pago.save(cl);
	}
	
	@GetMapping(value = "/{id}")
	public Pago getPago(@PathVariable("id") Integer id) {
		return pago.findById(id);
	}
	
	@PutMapping
	public String updatePago(@RequestBody Pago cl) {
		return pago.mod(cl);
	}
	
	@DeleteMapping
	public String delPago(@RequestBody Pago cl) {
		return pago.del(cl);
	}
}
