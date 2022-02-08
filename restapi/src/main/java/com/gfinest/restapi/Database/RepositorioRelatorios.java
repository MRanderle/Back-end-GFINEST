package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Relatorios;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioRelatorios extends JpaRepository<Relatorios,Long>{
    
}
