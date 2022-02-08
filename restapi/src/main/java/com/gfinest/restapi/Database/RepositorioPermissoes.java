package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Permissoes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPermissoes extends JpaRepository<Permissoes, Long>{
    
}
