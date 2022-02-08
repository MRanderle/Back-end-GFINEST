package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Valorvenda;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioValorvenda extends JpaRepository<Valorvenda,Long>{
    
}
