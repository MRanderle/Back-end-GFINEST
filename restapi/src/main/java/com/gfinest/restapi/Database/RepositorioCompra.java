package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Compra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCompra extends JpaRepository <Compra,Long>{
    
}
