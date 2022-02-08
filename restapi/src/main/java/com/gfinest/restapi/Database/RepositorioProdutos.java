package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Produtos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProdutos extends JpaRepository<Produtos,Long>{
    
    
}
