package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.NFvendas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioNFvendas extends JpaRepository<NFvendas,Long>{
    
}
