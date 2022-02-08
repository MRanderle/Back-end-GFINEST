package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Estoque;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEstoque extends JpaRepository<Estoque,Long>{
    
}
