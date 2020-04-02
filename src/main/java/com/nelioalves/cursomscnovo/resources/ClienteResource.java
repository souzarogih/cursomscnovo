package com.nelioalves.cursomscnovo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomscnovo.domain.Cliente;
import com.nelioalves.cursomscnovo.services.ClienteService;

@RestController//Diretiva do Spring Boot
@RequestMapping(value="/clientes")//Endpoint Rest que será usado.
public class ClienteResource {

	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)//Informa que é um metódo do tipo GET
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
