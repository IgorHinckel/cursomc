package com.igorhinckel.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igorhinckel.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
//Categoria nome do identificador e Integer é referente ao tipo do atributo do atributo verificador (ID da classe categoria)	
}
