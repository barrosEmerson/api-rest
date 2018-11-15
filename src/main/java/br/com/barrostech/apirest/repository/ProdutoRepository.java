package br.com.barrostech.apirest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.barrostech.apirest.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
}
