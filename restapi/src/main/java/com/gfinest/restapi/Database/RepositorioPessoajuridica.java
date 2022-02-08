package com.gfinest.restapi.Database;


import com.gfinest.restapi.Entidade.Pessoajuridica;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPessoajuridica extends JpaRepository<Pessoajuridica, Long> {
    
}
