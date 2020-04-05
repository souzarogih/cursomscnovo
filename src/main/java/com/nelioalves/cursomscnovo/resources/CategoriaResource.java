package com.nelioalves.cursomscnovo.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nelioalves.cursomscnovo.domain.Categoria;
import com.nelioalves.cursomscnovo.services.CategoriaService;

@RestController//Diretiva do Spring Boot
@RequestMapping(value="/categorias")//Endpoint Rest que será usado.
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	/*Este método faz consulta no endpoint de categorias*/
	@RequestMapping(value="/{id}",method=RequestMethod.GET)//Informa que é um metódo do tipo GET
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
	/*Esse método faz o insert de uma nova categoria no endpoint categorias*/
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Categoria obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	
	
}
