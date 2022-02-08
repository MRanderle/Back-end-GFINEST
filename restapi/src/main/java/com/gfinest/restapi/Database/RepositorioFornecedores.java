package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Fornecedores;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioFornecedores extends JpaRepository<Fornecedores,Long>{
    
}
