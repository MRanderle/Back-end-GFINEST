package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Pessoafisica;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPessoafisica extends JpaRepository<Pessoafisica,Long> {
    
}
