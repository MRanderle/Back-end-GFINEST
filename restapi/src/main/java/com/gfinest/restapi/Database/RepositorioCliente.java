package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCliente extends JpaRepository<Cliente,Long>{
    
}
