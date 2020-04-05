package com.nelioalves.cursomscnovo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomscnovo.domain.Pedido;
import com.nelioalves.cursomscnovo.services.PedidoService;

@RestController//Diretiva do Spring Boot
@RequestMapping(value="/pedidos")//Endpoint Rest que será usado.
public class PedidoResource {

	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)//Informa que é um metódo do tipo GET
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		Pedido obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
