package com.igorhinckel.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igorhinckel.cursomc.domain.Categoria;
import com.igorhinckel.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")//endpoint
public class CategoriaResource {
	//Instancia automaticamente o objeto
	@Autowired
	private CategoriaService service;

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	//Interrogação informa que pode retornar qualquer tipo
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
