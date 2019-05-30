package com.igorhinckel.cursomc.services;
 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorhinckel.cursomc.domain.Categoria;
import com.igorhinckel.cursomc.repositories.CategoriaRepository;
import com.igorhinckel.cursomc.services.exceptions.ObjectNotFoudException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoudException("Objeto não encontrado! ID: " + id + ", Tipo " + Categoria.class.getName()));
	}
}
