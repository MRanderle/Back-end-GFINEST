package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.NFcompras;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioNFcompra extends JpaRepository<NFcompras,Long> {
    
}
