package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Formaspagamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioFormaspagamento extends JpaRepository<Formaspagamento,Long>{
    
}
