package com.nelioalves.cursomscnovo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//Diretiva do Spring Boot
@RequestMapping(value="/categorias")//Endpoint Rest que será usado.
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)//Informa que é um metódo do tipo GET
	public String listar() {
		return "REST está funcionando!";
	}
	
}
