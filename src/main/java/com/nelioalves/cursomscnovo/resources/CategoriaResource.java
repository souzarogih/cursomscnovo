package com.nelioalves.cursomscnovo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomscnovo.domain.Categoria;

@RestController//Diretiva do Spring Boot
@RequestMapping(value="/categorias")//Endpoint Rest que será usado.
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)//Informa que é um metódo do tipo GET
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(1, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
			
		return lista;
	}
	
}
